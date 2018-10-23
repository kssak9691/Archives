CREATE VIEW accsvw10 AS
  SELECT *
  FROM accountmaster
  WITH READ ONLY CONSTRAINT accsvw10_read_only;