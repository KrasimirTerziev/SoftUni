<?php

//Write a class DecimalNumber that has a method that prints all its digits in reversed order.

class DecimalNumber
{

    private $number;

    public function __construct(string $num)
    {
        $this->number = $num;
    }

    public function reverse()
    {
        return strrev($this->number);
    }
}

$num = readline();
$number = new DecimalNumber($num);
echo $number->reverse();