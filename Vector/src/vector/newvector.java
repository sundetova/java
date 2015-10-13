/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

/**
 *
 * @author NEW
 */
class newvector <T extends Object>
{
T [] nums;
T [] num2;
int size;
 

newvector(T[] o)
{   
    nums= o;
}

newvector(int s)
{   
    size= s;
    nums = (T[]) new Object[size];

}

newvector()
{   
    size= 10;
    nums = (T[]) new Object[size];

}

T[] add(T n)
{
        int i;
        if(nums[nums.length-1]!=null) //if vector is full extend it
        {
    num2 = (T[]) new Object[nums.length+1];
      for(i=0;i<nums.length;i++)
    {
        num2[i]=nums[i];
    }
          num2[i]=n;
    nums = (T[]) new Object[nums.length+1];
    for(i=0;i<nums.length;i++)
    {
        nums[i]=num2[i];
    }
        }
        else //add element at position with first null
        {
            for(i=0;i<nums.length;i++)
    {
        if (nums[i]==null)
        {
        nums[i]=n;
        break;
        }
    }
            
        }
   
    return nums;
}

T get(int i)
{
    return nums[i];

}

T getlast()
{
    return nums[nums.length-1];

}

T getfirst()
{
    return nums[0];

}

int size()
{
    return nums.length;
}
        
}
