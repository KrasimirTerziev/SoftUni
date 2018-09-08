//Hello
<?php
session_start();
?>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
    <title>Friends</title>
</head>
<body>
<?php
if($_SESSION['is_logged']==true)
{
    echo '<a href="logout.php">Logout</a>';
}
else
{
    if($_GET['error']==1)
    {
        echo "Wrong user name";
    }
    ?>
    <form method="post" action="login.php">
        Username:<input type="text" name="login"><br>
        Password:<input type="password" name="pass"<<br>
        <input type="submit" value="Login">
    </form>
    <?php
}
?>
</body>
</html>