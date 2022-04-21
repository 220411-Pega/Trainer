/*
	Types of joins:
	1. LEFT JOIN: Includes all rows from the left hand table and only matching rows from the right hand table.
	   Rows from the left side table with no matching row in the right side table will get null values as placeholders.
	2. RIGHT JOIN: Includes all rows from the right side table and any matching rows from the left side table/
	   Just like in a Left Join, any rows from the right side table with no matching in the left side will get nulls.
	3. INNER JOIN: Includes only matching rows from both sides of the join.
	4. FULL JOIN: Includes all rows, regardless of match.
	5. CROSS JOIN: Creates every possible combination of rows. Not useful but kinda fun.

// Join format
// Just the SELECT statement
select * from author 

// Specify the join (left/right/inner)
LEFT JOIN book 

// Join condition: On [boolean expression]
ON author.id = book.authorid;
*/


/*
   View - A view is a query that is saved for later reuse. Once created, it can be used the same way as a table.
*/
-- View example
create view authors_and_books as 
	select author.*, book.title 
	from author left join book 
		on author.id = book.authorid

select * from authors_and_books;

/*
   Subquery - A subquery is when you use a SELECT statement in the place of a table or view in the FROM section
   or JOIN section inside of another SELECT statement.
*/
-- Subquery example
select * 
from book full join (
	select * 
	from author
	where age > 40
) as sub on book.authorid = sub.id;