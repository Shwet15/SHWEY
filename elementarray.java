

public  class elementarray{
    public static void main(String ags[]){
int[] arr = {10,20,30,40,50};
int key = 50;
boolean found = false;
for(int i = 0; i< arr.length; i++){
    if (arr[i] == key){
        found = true;
        break;
    }
}
if(found){
    System.out.println("elements " + key + "is found in the array.");
} else{
    System.out.println("element " + key + "is found in the array.");
}
    }
}  