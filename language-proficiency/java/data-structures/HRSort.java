/*
The majority of the code is provided in HackerRank and is pretty nicely and clearly written
so may as well be used. The simplest way to solve the problem is to provide the Student class
with a compareTo method so Collections.sort() can be called on the ArrayList of Student objects.
*/
import java.util.*;

class Student implements Comparable<Student>
{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa)
    {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId()
    {
        return id;
    }
    public String getFname()
    {
        return fname;
    }
    public double getCgpa()
    {
        return cgpa;
    }
	/*
	The compareTo method is called on a Student object.
	*/
    public int compareTo(Student s)
    {
		/*
		First compare the cgpa values. As the smaller values should come later in the array
		if this.cgpa is < s.cgpa then return 1. We want the values to be in descending order
		so smaller values should be "greater" from the perspective of the sort. Return -1 if
		vice versa.
		*/
        if(this.cgpa < s.cgpa) return 1;
        else if(this.cgpa > s.cgpa) return -1;
		//If the cgpa values are equal then the fname values must be compared
        else
        {
			/*
			As fnames are Strings we can simply call the String compareTo method. First see if the
			Strings are equal. If so then we'll compare the IDs
			*/
            if(this.fname.compareTo(s.fname) == 0)
            {
				//We're told IDs will never be equal so simply compare and return as follows
                if(this.id < s.id) return 1;
                else return -1;
            }
			//If the fname values weren't equal simply return the result of the compareTo for Strings
            else return this.fname.compareTo(s.fname);
        }
    }
}

class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(N > 0)
        {
            int id = scan.nextInt();
            String fname = scan.next();
            double cgpa = scan.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            N--;
        }

        Collections.sort(studentList);

          for(Student st: studentList)
        {
            System.out.println(st.getFname());
        }
    }
}
