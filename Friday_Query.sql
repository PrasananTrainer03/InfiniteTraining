select addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-dayofWEEK(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY) 'First Friday',

ADDDATE(addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-dayofWEEK(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), INTERVAL 7 DAY) 'Second Friday',

ADDDATE(ADDDATE(addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-dayofWEEK(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), INTERVAL 7 DAY),INTERVAL 7 DAY) 'Third Friday',

ADDDATE(ADDDATE(ADDDATE(addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-dayofWEEK(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), INTERVAL 7 DAY),INTERVAL 7 DAY), INTERVAL 7 DAY) 'Forth Friday',
 CASE
    WHEN DATE_FORMAT(ADDDATE(ADDDATE(LAST_DAY(ADDDATE(CURDATE(), INTERVAL -1 MONTH)),INTERVAL 1 DAY),
 INTERVAL 34- DAYOFWEEK(ADDDATE(LAST_DAY(ADDDATE(CURDATE(), INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), '%m') = DATE_FORMAT(ADDDATE(CURDATE(),INTERVAL 1 MONTH), '%m') THEN '--'
 ELSE ADDDATE(ADDDATE(LAST_DAY(ADDDATE(CURDATE(), INTERVAL -1 MONTH)),INTERVAL 1 DAY),
 INTERVAL 34- DAYOFWEEK(ADDDATE(LAST_DAY(ADDDATE(CURDATE(), INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY)
  END FIFTHFRIDAY;