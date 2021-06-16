package Statistics;
import java.util.*;

//mean, median & mode
public class day0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();

        //get array elems
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
           arr.add(s.nextInt());
        }
        s.close();

        //calculate mean
        float mean = 0;
        float total = 0;
        for (int i = 0; i < length; i++) {
            total += arr.get(i);
            mean = total/length;
        }
        System.out.println("Mean:" + mean);

        //calculate median
        Collections.sort(arr);
        int mid = arr.size()/2;
        double ans;
        if(arr.size()%2 == 0) {
            ans = (((double)arr.get(mid) + (double)arr.get(mid-1))/2);
        } else {
            ans = (arr.get(mid));
        }
        System.out.println("Median:" + ans);
 
        //calculate mode
        int maxValue = 0, maxCount = 0;
 
        for (int i = 0; i < length; ++i)  {
            int count = 0;
            for (int j = 0; j < length; ++j) {
                if (arr.get(j) == arr.get(i))
                    count++;
            }
            if (count > maxCount)  {
                maxCount = count;
                maxValue = arr.get(i);
                System.out.println("max value:" + maxValue);
            }
        }
    }
}

    
/* TEST CASE 3 code solution
Scanner sc = new Scanner(System.in);
int n =0;
n = sc.nextInt();
int arr[] = new int[n];

//////////////mean code starts here//////////////////
int sum = 0;
for(int i=0;i<n; i++)
{
     arr[i] = sc.nextInt();
     sum += arr[i]; 
}
System.out.println((double)sum/n); 
//////////////mean code ends here//////////////////


//////////////median code starts here//////////////////
Arrays.sort(arr);
int val = arr.length/2;
System.out.println((arr[val]+arr[val-1])/2.0); 
//////////////median code ends here//////////////////


//////////////mode code starts here//////////////////
int maxValue=0;
int maxCount=0;

for(int i=0; i<n; ++i)
{
    int count=0;

    for(int j=0; j<n; ++j)
    {
        if(arr[j] == arr[i])
        {
            ++count;
        }

        if(count > maxCount)
        {
            maxCount = count;
            maxValue = arr[i];
        }
    }
} 
System.out.println(maxValue);


*/