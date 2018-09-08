<?php

class Person
{
   public $name;
   public $age;


}
$person = new Person("Pesho", 20);
echo(count(get_object_vars($person)));
echo $person;
