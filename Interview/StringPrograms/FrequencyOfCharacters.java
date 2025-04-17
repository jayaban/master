package Interview.StringPrograms;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Helloo Worrld";

int[] f = new int[256];
for(char ch : str.toCharArray())
{
	f[ch]++;
}

for(int i=0;i<=f.length-1;i++)
{
	if(f[i]>0)
	{
		System.out.println((char)i +":"  +f[i]);
	}
}

	}

}
