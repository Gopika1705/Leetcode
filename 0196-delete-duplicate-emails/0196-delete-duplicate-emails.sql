# Write your MySQL query statement below
DELETE from Person
where id not in(
    select * from(
        select min(id)
        from Person
        group by email
    )t
);