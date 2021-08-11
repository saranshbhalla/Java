#Generics

##Why use Generics
Take example of List:  
A list without generics looks like:
```aidl
    List list = new ArrayList();
```

1. Use of Generics avoids the need for casting 
2. prevents error of adding wrong object type to list

##About Genrics
Generics are often referred to as parameterized types ( a type sent as a parameter)  
```   
List<Integer>
```

1. Generics is a compile time construct
2. Generics do no apply to the instance. i.e. in this case, it is not applied to the list object. Instead
   it is a property of the variable name. Compiler just makes sure that the variable name is associated to the
   assigned parameterized type (GenericsRuntimeCheck.java code)
3. Once all compile checks are done, the compiler removes all generics information and makes it the original List type (without generics)
   This is called **type erasure**
4. This contrasts with how the Java datatypes work. The datatypes are a runtime construct 
   and differ from Generics in that they are linked to the array object and uphold the integrity
   of the data that goes into the arrays. (TypesRuntimeCheck.java code)

##Autoboxing and unboxing
Concept of autoboxing/unboxing was introduced to allow primitives to be used as Generics.  

Autoboxing: primitive value => wrapper class
```aidl
    int a = 10;  
    Integer x = a;
```

Unboxing: Wrapper class => primitive type
```aidl
    Integer x = new Integer(10);  
    int i =x
```

##Create custom generic types
1. Generics can help us restrict the data that enters into an object (Cage.java)
2. It is highly recommended to have <> on the right hand side of the initialization
   expression especially when you have one or more arguments being sent into the constructor (Zoo.java).
```aidl
Cage<Monkey> cage2 = new Cage( new Lion(), new Monkey());
``` 
if you don't specify the type on the right, compiler will not validate the right side
expression. And this expression would be allowed.


##Implications (Inheritance and Polymorphism)
##Wildcard and Upper/Lower bounds
##Working with static methods
    