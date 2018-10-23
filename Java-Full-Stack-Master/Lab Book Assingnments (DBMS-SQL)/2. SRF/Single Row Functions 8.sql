select
(to_char(to_date(to_char(next_day(last_day(sysdate)-interval '7' day,'FRIDAY'),'dd'),'j'),'jsp') || ' of ' ||to_char(sysdate,'month')||','||to_char(sysdate,'yyyy')) as "PAY DATE"
from dual;