<form method="get">
    <div>First Number:</div>
    <input type="number" name="num1"/>
    <div>Second Number:</div>
    <input type="number" name="num2"/>
    <div><input type="submit"/></div>
</form>

<?php
if (isset($_GET['num1']) && isset($_GET['num2'])) {
    $numOne = $_GET['num1'];
    $numTwo = $_GET['num2'];
    $sum = $numOne + $numTwo;
    echo "$numOne + $numTwo = $sum";
}
?>