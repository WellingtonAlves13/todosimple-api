const url = "http://localhost:8080/task/user/12";

function hideLoader(){
    document.getElementById("loading").style.display = "none";
}

function show(tasks){

    let tab = `<thead>
        <th scope="col">#</th>
        <th scope="col">Description</th>
        <th scope="col">Username</th>
        <th scope="col">User Id</th> 
        </thead>`

    for (let task of tasks){
        tab += `
            <tr>
                <td scope="row">$ {task.id}</td>
                <td scope="row">$ {task.description}</td>
                <td scope="row">$ {task.user.username}</td>
                <td scope="row">$ {user.user.id}</td>
            </tr>
        `
    }

    document.getElementById("tasks").innerHTML = tab;
}

async function getAPI(url){
    const response = await fetch(url, { method: "GET"});

    var data = await response.json();
    if(response)
        hideLoader();
    show(data);
}

getAPI(url)