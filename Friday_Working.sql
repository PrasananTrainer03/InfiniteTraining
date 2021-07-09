select last_day(curdate());

select adddate(adddate(last_day(curdate()),INTERVAL -1 MONTH), INTERVAL 1 DAY);

select weekday(adddate(adddate(last_day(curdate()),INTERVAL -1 MONTH), INTERVAL 1 DAY));

select addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-weekday(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY) 'First Friday',
adddate(addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-weekday(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), INTERVAL 7 DAY) 'Second Friday',
ADDDate(adddate(addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-weekday(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), INTERVAL 7 DAY), INTERVAL 7 DAY) 'Third Friday',
ADDDate(ADDDate(adddate(addDate(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY),
INTERVAL 6-weekday(adddate(last_day(adddate(curdate(),INTERVAL -1 MONTH)),INTERVAL 1 DAY)) DAY), INTERVAL 7 DAY), INTERVAL 7 DAY),
INTERVAL 7 DAY) 'Fourth Friday'