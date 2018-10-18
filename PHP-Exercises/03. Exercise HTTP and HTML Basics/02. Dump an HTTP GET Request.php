<form method="get">
    <div>Name:</div>
    <input type="text" name="personName"/>
    <div>Age:</div>
    <input type="number" name="age"/>
    <div>Town:</div>
    <select name="townId">
        <option value="10">Sofia</option>
        <option value="20">Varna</option>
        <option value="30">Plovdiv</option>
    </select&gt;
    <div><input type="submit"/></div>
</form>

<?php

$arrForm = [];

if (isset($_GET['personName']) &&
    isset($_GET['age']) &&
    isset($_GET['townId'])) {
    $arrForm [0] = $_GET['personName'];
    $arrForm [1] = $_GET['age'];
    $arrForm [2] = $_GET['townId'];
}
   var_dump($arrForm);

?>