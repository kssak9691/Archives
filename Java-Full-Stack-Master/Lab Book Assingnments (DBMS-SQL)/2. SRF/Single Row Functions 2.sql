SELECT Student_name, TO_CHAR (Student_dob, 'Month, DD YYYY') Student_dob from Student_Master
                       WHERE TO_CHAR (Student_dob, 'Day') like '%Saturday%' OR TO_CHAR (Student_dob, 'Day') like '%Sunday%';