package Dinosaur1;

/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private int g;
    private String gender;
    private int health; //1-100
    
    /**
     * Default constructor for objects of class Dinosaur
     */
    public Dinosaur()
    {
        type = "Dino";
        age = 0;
        g = (int)(Math.random()*10);
        if (g<5)
        {
            this.gender = "female";
        }
        else
        {
            this.gender = "male";
        }
        this.health=10;
    }
    
    /**
     * Explict constructor for Dino Class
     */
    public Dinosaur(String t)
    {
        this.type = t; //so it's not alias 
        this.age = 0;
        this.health = 10;
        g = (int)(Math.random()*10);
        if (g<5)
        {
            this.gender = "female";
        }
        else
        {
            this.gender = "male";
        }
    }
    
    /******* Getters *******/
    // Getters return private data
    public String getType()
    {
        return this.type;
        
      
    }
    
    public int getAge()
    {
        return this.age;
        
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public int getHealth()
    {
        return this.health;
    }
    
    /******** Setters ********/
    public void setType(String t)
    {
        this.type = t; //no return
    }
    
    public void setAge(int a)
    {
        this.age = 10;
    }
    
    public void setHealth(int h)
    {
        this.health = 10;
    }
    
    public void getGender(String g)
    {
        this.gender = g;
    }
    
    public boolean equals(Dinosaur d) //has to pass an object
    {
        if(this.type.equals(d.getType()))
        {
            if(this.age == d.getAge())
            {
                if(this.health == d.getHealth())
                {
                    if(this.gender.equals(d.getGender()))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void ageUp()
    {
        if(this.health > 0)
        {
            this.age++;
            
            //if age is less than 10, health incrases by 10
            if(this.age > 30)
            {
                this.health = this.health + 10;
            }        
            //no change to health if age is between 10-24
            
            //health decrease by 5 if age is 25-30
            else if (this.age >= 25 && this.age <= 30)
            {
                this.health = this.health-5;
            }
            //if health decreases by 10 if age is greater than 30
            else
            {
                this.health = this.health - 10;
            }
        }  
    }
    
    /**
     * return Dino as a string
     */
    public String toString()
    {
        String answer = this.type + " " + this.age + " " + this.health + " "+ this.gender;
        return answer;
    }
}
