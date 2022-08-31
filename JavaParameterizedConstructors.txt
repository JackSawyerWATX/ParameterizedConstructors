<<<<<<< HEAD


			+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-+
			|==>Parameterized Constructors <==|
			+~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+

A look at parameterized constructors and how to incorporate the super and this keyword together to form a complete picture.

If a constructor is created, Java will no longer provide a default constructor.

A 'super' is used to call to the parent class constructor into the Frog constructor.

Also super is used to call on the instance variables 'name and color,' as name and color do not sit in the Frog instance but in the parent class instance of Amphibian. The keyword 'this' is used to refer to the current class instance variable.

The object of Frog is created and passed in the values the constructor was expecting. Notice in the Frog class, we created a constructor that asked for two String values and an int value. The compiler doesn't care about what those variables are called. The compiler cares that the order, datatypes, and the number of arguments passed into the constructor call match the parameter list of the created constructor. Three values are passed into the Frog constructor: two String values, and one int value. These arguments match the parameterized constructor created earlier. Then the dart reference variable is used to call the whatAmI method from the Frog class.

When creating objects, constructors are called to initialize their state. So far, I've mainly worked with no-args constructors. These constructors do not take in any values. Now I'm going to build constructors that DO take in information called parameterized constructors.
=======


			+-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-+
			|==>Parameterized Constructors <==|
			+~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~+

A look at parameterized constructors and how to incorporate the super and this keyword together to form a complete picture.

If a constructor is created, Java will no longer provide a default constructor.

A 'super' is used to call to the parent class constructor into the Frog constructor.

Also super is used to call on the instance variables 'name and color,' as name and color do not sit in the Frog instance but in the parent class instance of Amphibian. The keyword 'this' is used to refer to the current class instance variable.

The object of Frog is created and passed in the values the constructor was expecting. Notice in the Frog class, we created a constructor that asked for two String values and an int value. The compiler doesn't care about what those variables are called. The compiler cares that the order, datatypes, and the number of arguments passed into the constructor call match the parameter list of the created constructor. Three values are passed into the Frog constructor: two String values, and one int value. These arguments match the parameterized constructor created earlier. Then the dart reference variable is used to call the whatAmI method from the Frog class.
>>>>>>> 84b6e7efe935b5efb131b30802450242673b26b5
