/*
This problem has hidden code that cannot be modified but you just need to write a singleton class.
We simply need to create a Singleton with a private constructor  which means the constructor is
restricted to the class itself.

A private static Singleton that is set to null and a public String str (name specified in question).

The only method get instance creates a new Singleton if it doesn't already exist (as all Singletons are
as single shared instance) otherwise it returns the Singleton.

The HackerRank code deals with the rest of the input output, we simply need to write the Singleton
class.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    public String str;

    // private constructor restricted to this class itself
    private Singleton()
    {
        str = "";
    }

    // static method to create instance of Singleton class
    public static Singleton getSingleInstance()
    {
        if(single_instance == null) single_instance = new Singleton();

        return single_instance;
    }
}
