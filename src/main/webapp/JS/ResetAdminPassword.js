// Element references for password visibility toggle buttons
var showPassword = document.getElementById("showPassword");
var showConfirmedPassword = document.getElementById("showConfirmedPassword");

// Element references for password and confirmed password inputs
var inputPassword = document.getElementById("password");
var confirmInputPassword = document.getElementById("confirmPassword");

// Element references for displaying error and success messages
var emptyPasswordError = document.getElementById("empty-password-error");
var errorPasswordRegex = document.getElementById("password-regex-error");
var successPasswordRegex = document.getElementById("password-regex-success");
var confirmPasswordSuccess = document.getElementById("confirm-password-success");
var confirmPasswordError = document.getElementById("confirm-password-error");

// Form element reference
var form = document.getElementById("resetPasswordForm");

// Regular expression for password validation
var passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

/**
 * Validates the password input against specified criteria.
 * Displays appropriate error or success messages.
 * @returns {boolean} - Returns true if the password is valid, false otherwise.
 */
function validatePassword() {
    var isValid = true;

    // Hide previous error and success messages
    emptyPasswordError.style.display = "none";
    errorPasswordRegex.style.display = "none";
    errorPasswordRegex.innerHTML = "";
    successPasswordRegex.style.display = "none";

    // Check if the password field is empty
    if (inputPassword.value.trim() === "") {
        emptyPasswordError.style.display = "block";
        isValid = false;
    }

    // Check if the password contains at least one lowercase letter
    if (!/(?=.*[a-z])/.test(inputPassword.value)) {
        errorPasswordRegex.innerHTML = "La password deve contenere almeno una lettera minuscola.";
        errorPasswordRegex.style.display = "block";
        isValid = false;
    } 
    // Check if the password contains at least one uppercase letter
    else if (!/(?=.*[A-Z])/.test(inputPassword.value)) {
        errorPasswordRegex.innerHTML = "La password deve contenere almeno una lettera maiuscola.";
        errorPasswordRegex.style.display = "block";
        isValid = false;
    } 
    // Check if the password contains at least one digit
    else if (!/(?=.*\d)/.test(inputPassword.value)) {
        errorPasswordRegex.innerHTML = "La password deve contenere almeno un numero.";
        errorPasswordRegex.style.display = "block";
        isValid = false;
    } 
    // Check if the password contains at least one special character
    else if (!/(?=.*[@$!%*?&])/.test(inputPassword.value)) {
        errorPasswordRegex.innerHTML = "La password deve contenere almeno un carattere speciale.";
        errorPasswordRegex.style.display = "block";
        isValid = false;
    } 
    // Check if the password is at least 8 characters long
    else if (!/.{8,}/.test(inputPassword.value)) {
        errorPasswordRegex.innerHTML = "La password deve essere lunga almeno 8 caratteri.";
        errorPasswordRegex.style.display = "block";
        isValid = false;
    } 
    // Display success message if the password meets all criteria
    else {
        successPasswordRegex.innerHTML = "La password rispetta i requisiti.";
        successPasswordRegex.style.display = "block";
    }

    return isValid;
}

// Add event listeners for password input blur and input events
inputPassword.addEventListener("blur", validatePassword);
inputPassword.addEventListener("input", validatePassword);

/**
 * Toggles password visibility on mousedown and mouseup events.
 */
showPassword.addEventListener("mousedown", function() {
    inputPassword.type = "text";
    showPassword.classList.remove("bi-eye-slash");
    showPassword.classList.add("bi-eye");
});

showPassword.addEventListener("mouseup", function() {
    inputPassword.type = "password";
    showPassword.classList.remove("bi-eye");
    showPassword.classList.add("bi-eye-slash");
});

/**
 * Toggles confirmed password visibility on mousedown and mouseup events.
 */
showConfirmedPassword.addEventListener("mousedown", function() {
    confirmInputPassword.type = "text";
    showConfirmedPassword.classList.remove("bi-eye-slash");
    showConfirmedPassword.classList.add("bi-eye");
});

showConfirmedPassword.addEventListener("mouseup", function() {
    confirmInputPassword.type = "password";
    showConfirmedPassword.classList.remove("bi-eye");
    showConfirmedPassword.classList.add("bi-eye-slash");
});

/**
 * Validates if the confirmed password matches the original password.
 */
confirmInputPassword.addEventListener("input", function() {
    if (confirmInputPassword.value !== inputPassword.value) {
        confirmPasswordError.innerHTML = "Le due password non coincidono";
        confirmPasswordError.style.display = "block";
        confirmPasswordSuccess.style.display = "none";
    } else {
        confirmPasswordError.style.display = "none";
        confirmPasswordSuccess.innerHTML = "Le due password coincidono";
        confirmPasswordSuccess.style.display = "block";
    }
});

/**
 * Prevents form submission if passwords are not valid.
 * @param {Event} event - The submit event.
 */
form.addEventListener("submit", function(event) {
    var isPasswordValid = validatePassword();
    var isConfirmPasswordValid = (confirmInputPassword.value === inputPassword.value);

    // Prevent form submission if the passwords are not valid
    if (!isPasswordValid || !isConfirmPasswordValid) {
        event.preventDefault();
    }
});
