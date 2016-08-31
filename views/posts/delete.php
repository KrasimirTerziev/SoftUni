<?php $this->title = 'Delete Post'; ?>

<h1>Are you sure you want to delete this post?</h1>

<form class="delete" method="post">
    <div>Title:</div><input class="delete-title" type="text" value="<?=
        htmlspecialchars($this->post['title'])?>" disabled />
    <div>Content:</div>
    <textarea class="delete-text" disabled><?=
        htmlspecialchars($this->post['content'])?></textarea>
    <div>Date:</div><input  class="delete-title" type="text" value="<?=
        htmlspecialchars($this->post['date'])?>" disabled />
    <div>Author ID:</div><input  class="delete-title" type="text" value="<?=
        htmlspecialchars($this->post['user_id'])?>" disabled />
    <div class="button-second">
        <input class="submit" type="submit" value="Delete" />
        <a href="<?=APP_ROOT?>/posts">Cancel</a></div>
</form>
