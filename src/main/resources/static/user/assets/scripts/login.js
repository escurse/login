const idInput = document.querySelector('input[name = id]');
const idCheckBox = document.querySelector('input[name = check]');
const submitBtn = document.querySelector('button');
submitBtn.onclick = () => {
    console.log(idInput.value);
    if(idCheckBox.checked) {
        const id = idInput.value;
        const expire = new Date();
        expire.setMinutes(expire.getMinutes() + 1);
        document.cookie = `id=${id}; expires=${expire.toUTCString()}`;
    } else {
        document.cookie = 'id=';
    }
}

const cookies = document.cookie;
const cookieEntries = cookies.split(';');
for (const cookieEntry of cookieEntries) {
    const [name, value] = cookieEntry.trim().split('=');
    if(name === 'id') {
        idInput.value = value;
    }
}
