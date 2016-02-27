package com.RyanNickel.experimentsdockerenv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        if (System.getenv("TEST_ENV_ITEM") == null) {
            throw new Exception("TEST_ENV_ITEM not specified");
        } else {
            System.out.println(System.getenv("TEST_ENV_ITEM"));
        }
    }
}
