/* chapter 3 Assigment.
1.Compare and contrast the if single-selection statement and the while repetition statement. How are these two statements similar? How are they different? 
 similarities: both use a boolean condition to control flow
 the if single selection stops execution when its true,if false,it skips but the WHILE LOOP executes repetedly until its false*/

/* 2.Explain what happens when a Java program attempts to divide one integer by another. What happens to the fractional part 
of the calculation? How can you avoid that outcome? 
The result will be an integer. the fraction is discarded.*/

/* 3.Describe the two ways in which control statements can be combined. 
Nested control : when a control statement is placed inside another.i.e and if inside another if statement.
Compound control statement;when multiple control statement are place sequentially.*/

/* 4 What type of repetition would be appropriate for calculating the sum of the first 100 positive integers? 
What type would be appropriate for calculating the sum of an arbitrary number of positive integers? 
Briefly describe how each of these tasks could be performed. 
For loop, we already know the number of iteration. so we loop from 1 to 100.(definite)
While loop,we dont know how many numbers the user will input.its indefinite */

/* 4What is the difference between preincrementing and postincrementing a variable
Pre-incrementing :here the incremented happens first and then the new value is expressed.
Post-incrementing: here the current value is used before incrememnting.*/

/* 6 Identify and correct the errors in each of the following pieces of code. [Note: There may be more than one error in each piece of code.] 
a) if (age >= 65); 
system.out.println("Age is greater than or equal to 65"); 
else System.out.println("Age is less than 65)";*/ 

public class UserAge{
	public static void main(String[] args){
		
		
		
		int Age = 65;
		if (Age >= 65){
		System.out.printf("Age is greater than or equal to 65",Age);
	}
	else {
		System.out.printf("Age is less than 65",Age);
        }
		
	}
}

public class SumExample {
    public static void main(String[] args) {
        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
        }
        System.out.println("Total sum: " + total);
    }
}
