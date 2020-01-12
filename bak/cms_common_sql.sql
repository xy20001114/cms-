-- 生成增删改查SQL
SELECT CONCAT('SELECT * FROM ',TABLE_NAME) 'selectSql',
CONCAT('SELECT * FROM ',TABLE_NAME,' WHERE id=#{id}') 'selectByIdSql',
CONCAT('UPDATE ',TABLE_NAME,'\r SET ',GROUP_CONCAT(COLUMN_NAME,'=#{',COLUMN_NAME,'}'),' \rWHERE id=','#{id}') updateSql,
CONCAT('INSERT INTO ',TABLE_NAME,'(',GROUP_CONCAT(COLUMN_NAME),')VALUES \r\n(',GROUP_CONCAT('#{',COLUMN_NAME,'}'),')') insertSql,
CONCAT('DELETE FROM ',TABLE_NAME,' WHERE id in(${ids})') deleteSql
FROM information_schema.`COLUMNS` c
WHERE TABLE_SCHEMA='cms_1710f' AND TABLE_NAME='cms_user' AND COLUMN_NAME!='id'
GROUP BY TABLE_NAME;
-- PojoSql
SELECT CONCAT('/** ',COLUMN_COMMENT,' **/\r\n','private ',IF(DATA_TYPE='int','Integer',IF(DATA_TYPE='date','Date','String')),' ',COLUMN_NAME,';')
FROM information_schema.`COLUMNS` c
WHERE TABLE_SCHEMA='cms_1710f' AND TABLE_NAME='cms_user';
