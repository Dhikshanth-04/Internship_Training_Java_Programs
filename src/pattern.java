

public class pattern {
public static void main(String[] args) {
int n = 10;

System.out.println("======Pyramid=====");
for(int i=0; i<n; i++) {
for(int k=0; k<=n-i; k++) {
	System.out.print(" ");
}
for(int j=0;j<i;j++) {
	System.out.print("* ");
}
System.out.println();
}


System.out.println("\n======Right angle triangle=====");
for(int i=0; i<n; i++) {
for(int j=0;j<i;j++) {
	System.out.print("*");
}
System.out.println();
}


System.out.println("\n======Inverted right angle triangle=====");
for(int i=0; i<n; i++) {
for(int k=0; k<=n-i; k++) {
	System.out.print(" ");
}
for(int j=0;j<i;j++) {
	System.out.print("*");
}
System.out.println();
}


System.out.println("\n======Hollow Pyramid=====");
for(int i=0; i<=n; i++) {
for(int k=0; k<=n-i; k++) {
	System.out.print(" ");
}
for(int j=0;j<=i; j++) {
	if(i==n||j==0||i==j) { 
		System.out.print("* ");
	}
	else {
		System.out.print("  ");
	}
}
System.out.println();
}

System.out.println("\n======Hollow Right Angle Triangle=====");
for(int i=0; i<=n; i++) {
for(int j=0;j<=i; j++) {
	if(i==n||j==0||i==j) { 
		System.out.print("* ");
	}
	else {
		System.out.print("  ");
	}
}
System.out.println();
}


System.out.println("\n=======Hollow Inverted Right Angle Triangle =======");
for(int i=0;i<=n; i++) {
for(int k=0; k<=n-i; k++) {
	System.out.print(" ");
}
for(int j=0; j<=i; j++) {
	if(i==n||j==0||i==j) { 
		System.out.print("*");
	}
	else {
		System.out.print(" ");
	}
}
System.out.println();
}


System.out.println("\n=====Hollow Square=======");
for(int i=0; i<=n; i++) {
for(int j=0; j<=n; j++) {
if(i==n || i==0 || j==0 || j==n) {
	System.out.print("* ");
}
else {
	System.out.print("  ");
}
}
System.out.println();
}


System.out.println("\n=====Hollow Cross Square=======");
for(int i=0; i<=n; i++) {
for(int j=0; j<=n; j++) {
if(i==n || i==0 || j==0 || j==n || i==j || j==n-i) {
	System.out.print("* ");
}
else {
	System.out.print("  ");
}
}
System.out.println();
}


}
}
