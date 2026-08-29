// Shared client-side auth helpers backed by localStorage.
// Note: this is a front-end demo only, not secure storage for real passwords.

const USERS_KEY = "loginProject_users";
const SESSION_KEY = "loginProject_session";

function getUsers() {
  return JSON.parse(localStorage.getItem(USERS_KEY) || "{}");
}

function saveUsers(users) {
  localStorage.setItem(USERS_KEY, JSON.stringify(users));
}

function registerUser(username, password) {
  const users = getUsers();
  if (users[username]) {
    return { ok: false, message: "That username is already taken." };
  }
  users[username] = { password };
  saveUsers(users);
  return { ok: true };
}

function verifyUser(username, password) {
  const users = getUsers();
  const user = users[username];
  if (!user || user.password !== password) {
    return { ok: false, message: "Invalid username or password." };
  }
  return { ok: true };
}

function startSession(username) {
  sessionStorage.setItem(SESSION_KEY, username);
}

function getSession() {
  return sessionStorage.getItem(SESSION_KEY);
}

function endSession() {
  sessionStorage.removeItem(SESSION_KEY);
}

function showBanner(el, message, type) {
  el.textContent = message;
  el.className = "banner show " + type;
}
