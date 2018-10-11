package Bean;

import static java.lang.System.out;

public class bean_1 
{
    String name;
    String id;
    int age;
    
    public void setName(String name)
    {
        this.name=name;    
    }
    
    public void setId(String id)
    {
        this.id=id;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    
    public String getName()
    {
         //out.println(name);
        return name;
    }
    
    public String getId()
    {
        // out.println(id);
        return id;
    }
    
    public int getAge()
    {
        // out.println(id);
        return age;
    }
}
