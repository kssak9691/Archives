SELECT ROUND(MAX(Staff_sal)) AS "Maximum", ROUND(MIN(Staff_sal)) AS "Minimum", ROUND(SUM(Staff_sal)) AS "Total", ROUND(AVG(Staff_sal)) AS "Average"
               FROM Staff_Master 
                         GROUP BY Dept_code;