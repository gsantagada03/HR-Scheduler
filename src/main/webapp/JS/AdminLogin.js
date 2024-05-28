// Form element reference
var form = document.getElementById("loginForm");

// Element references for username input and error message
var inputUsername = document.getElementById("username");
var usernameError = document.getElementById("username-blur-error");

// Element references for password input, error message, and show password toggle button
var inputPassword = document.getElementById("password");
var passwordError = document.getElementById("password-blur-error");
var showPassword = document.getElementById("showPassword");

/**
 * Event listener for username input blur event.
 * Displays an error message if the username field is empty.
 */
inputUsername.addEventListener("blur", function() {
    if (inputUsername.value.trim() === "") {
        usernameError.style.display = "block";
    } else {
        usernameError.style.display = "none";
    }
});

/**
 * Event listener for password input blur event.
 * Displays an error message if the password field is empty.
 */
inputPassword.addEventListener("blur", function() {
    if (inputPassword.value.trim() === "") {
        passwordError.style.display = "block";
    } else {
        passwordError.style.display = "none";
    }
});

/**
 * Event listener for form submit event.
 * Prevents form submission if the username or password fields are empty.
 * @param {Event} event - The submit event.
 */
form.addEventListener("submit", function(event) {
    var isFormValid = true;

    if (inputUsername.value.trim() === "") {
        usernameError.style.display = "block";
        isFormValid = false;
    }

    if (inputPassword.value.trim() === "") {
        passwordError.style.display = "block";
        isFormValid = false;
    }

    if (!isFormValid) {
        event.preventDefault();
    }
});

/**
 * Event listener for showing password on mousedown event.
 * Changes the password input type to text.
 */
showPassword.addEventListener("mousedown", function() {
    inputPassword.type = "text";
    showPassword.classList.remove("bi-eye-slash");
    showPassword.classList.add("bi-eye");
});

/**
 * Event listener for hiding password on mouseup event.
 * Changes the password input type to password.
 */
showPassword.addEventListener("mouseup", function() {
    inputPassword.type = "password";
    showPassword.classList.remove("bi-eye");
    showPassword.classList.add("bi-eye-slash");
});
