/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

const val sample1: Byte = 0x3A;
val sample2: Byte = 58;
val heartRate: Int = 85;
val deposits: Double = 135002796.0;
const val acceleration: Float = 9.800F;
val mass: Float = 14.6F;
val distance: Double = 129.763001;
val lost =  true;
val expensive = true;
val choice: Int = 2;
const val integral = '∫';
const val greeting: String = "Hello";
val name: String = "Karen";

fun main(args: Array<String>) {
    if(sample1 == sample2){
        System.out.println("The samples are equal.");
    }
    else{
        System.out.println("The samples are not equal.");
    }
    if(heartRate >= 40 && heartRate <= 80){
        System.out.println("Heart rate is normal.");
    }
    else{
        System.out.println("Heart rate is not normal.");
    }
    if(deposits >= 100000000.0){
        System.out.println("You are exceedingly wealthy.");
	}
    else{
        System.out.println("Sorry you are so poor.");
    }
    var force: Float = mass * acceleration;
    System.out.println("force = " + force);
    System.out.print(distance);
    System.out.println(" is the distance.");
    if(lost && expensive){
        System.out.println("I am really sorry! I will get the manager.");
    }
    else if(lost && !expensive){
        System.out.println("Here is coupon for 10% off.");
    }
    when {
        choice == 1 -> println("You chose 1.");
        choice == 2 -> println("You chose 2.");
        choice == 3 -> println("You chose 3.");
        else -> println("You made an unknown choice.")
    }
    System.out.println(integral + " is an integral.");
    var array = Array(6, { i -> (i + 5).toString() });
    for(i in array){
        println("i = " + i);
    }
    var age = 0;
    while(age < 6){
        println("age = " + age);
        age = age + 1;
    }
    println(greeting + " " + name);
}