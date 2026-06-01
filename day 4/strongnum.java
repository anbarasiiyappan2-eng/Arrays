public class strongnum {
public static void main(String[] args) {
int num=145,temp=num,sum=0;
while(temp>0){
int d=temp%10,f=1;
for(int i=1;i<=d;i++){f=f*i;}
sum=sum+f;
temp=temp/10;
}
if(sum==num)System.out.println("Strong Number");
else System.out.println("Not Strong Number");
}
}
