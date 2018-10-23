package com.capgemini.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.capgemini.bank.bean.DemandDraft;

public class DemandDraftDAO implements IDemandDraftDAO {
	private Connection conn = ConnectionProvider.getDBConnection();
	@Override
	public int addDemandDraftDetails(DemandDraft demandDraft) throws SQLException {
		try {
			conn.setAutoCommit(false);
			PreparedStatement pstmt1=conn.prepareStatement("INSERT INTO demand_draft(transaction_id,customer_name,in_favor_of,phone_number,dd_amount,dd_commission,dd_description,date_of_transaction) values(Transaction_id_Seq.nextval,?,?,?,?,?,?,sysdate)");
			pstmt1.setString(1,demandDraft.getCustomerName());
			pstmt1.setString(2,demandDraft.getInFavorOf());
			pstmt1.setLong(3,demandDraft.getPhoneNumber());
			pstmt1.setInt(4,demandDraft.getDdAmount());
			pstmt1.setInt(5,demandDraft.getDdCommission());
			pstmt1.setString(6,demandDraft.getDdDescription());
			pstmt1.executeUpdate();
			PreparedStatement pstmt2=conn.prepareStatement("select max(transaction_id) from demand_draft");
			ResultSet rs=pstmt2.executeQuery();
			rs.next();
			int transactionId=rs.getInt(1);
			conn.commit();
			return transactionId;
		} catch(SQLException e){
			e.printStackTrace();
			conn.rollback();
			throw e;
		}
		finally{
			conn.setAutoCommit(true);
		}
	}

	@Override
	public DemandDraft getDemandDraftDetails(int transactionId) throws SQLException {
		PreparedStatement pstmt=conn.prepareStatement("select * from demand_draft where transaction_id="+transactionId);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			DemandDraft demandDraft = new DemandDraft(rs.getString("customer_name"), rs.getLong("phone_number"),rs.getString("in_favor_of"),rs.getInt("transaction_id"), rs.getDate("date_of_transaction"), rs.getInt("dd_amount"),rs.getInt("dd_commission"), rs.getString("dd_description"));
			return demandDraft;
		}
		return null;
	}

}
