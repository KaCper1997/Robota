select concat(substring(upper(name) ,1,2), substring(upper(surname),1,2) ) from  students;
select concat(substring(upper(name) ,1,2), substring(upper(surname),1,2) ) from  students order by name desc, surname desc ;

