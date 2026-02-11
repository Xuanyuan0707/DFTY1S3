<?php
require '../_base.php';
// ----------------------------------------------------------------------------

if (is_post()) {
    // TODO
}

// ----------------------------------------------------------------------------
$_title = 'Page | Demo 2';
include '../_head.php';
?>

<form method="post" class="form">
    <label for="id">Id</label>
    <input type="text" id="id" name="id" maxlength="10">
    <span class="err">XXX</span>

    <label for="name">Name</label>
    <input type="text" id="name" name="name" maxlength="100">
    <span class="err">XXX</span>

    <section>
        <button>Submit</button>
        <button type="reset">Reset</button>
    </section>
</form>

<?php
include '../_foot.php';