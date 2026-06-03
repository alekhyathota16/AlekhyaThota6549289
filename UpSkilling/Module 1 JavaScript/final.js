
// Exercise 1 - JavaScript Basics & Setup


console.log("Welcome to the Community Portal");

window.onload = () => {
    alert("Page loaded successfully");
};


// Exercise 2 - Syntax, Data Types and Operators


const eventName = "Music Fest";
const eventDate = "10 Aug";
let seats = 50;

console.log(
    `${eventName} on ${eventDate} has ${seats} seats`
);

seats--;
console.log(`Remaining Seats: ${seats}`);


// Exercise 3 - Conditionals, Loops and Error Handling


const events = [
    {
        name: "Music Fest",
        date: "10 Aug",
        seats: 50,
        category: "music"
    },

    {
        name: "Tech Talk",
        date: "12 Aug",
        seats: 20,
        category: "music"
    },

    {
        name: "Dance Show",
        date: "15 Aug",
        seats: 10,
        category: "dance"
    }
];

const eventOutput =
document.getElementById("eventOutput");

events.forEach(event => {

    if (event.seats > 0) {

        eventOutput.innerHTML +=
        `${event.name} - Seats: ${event.seats}<br>`;
    }
});

function register(user, event) {

    try {

        if (event.seats <= 0) {

            throw new Error(
                "No seats available"
            );
        }

        event.seats--;

        console.log(
            `${user} registered successfully`
        );

    }
    catch(error) {

        console.log(error.message);
    }
}


// Exercise 4 - Functions, Scope, Closures,
// Higher Order Functions


function addEvent(name, category) {

    events.push({
        name,
        category,
        seats: 20
    });
}

function registerUser(user, eventName) {

    console.log(
        `${user} registered for ${eventName}`
    );
}

function filterEventsByCategory(
    category,
    callback
) {

    const result =
    events.filter(
        event => event.category === category
    );

    callback(result);
}

function registrationCounter() {

    let count = 0;

    return function () {

        count++;

        return count;
    };
}

const musicCount =
registrationCounter();

console.log(musicCount());
console.log(musicCount());


// Exercise 5 - Objects and Prototypes


function Event(
    eventName,
    seatCount
) {

    this.name = eventName;
    this.seats = seatCount;
}

Event.prototype.checkAvailability =
function () {

    return this.seats > 0;
};

const myEvent =
new Event("Workshop", 40);

console.log(
    myEvent.checkAvailability()
);

Object.entries(myEvent)
.forEach(([key, value]) => {

    console.log(key, value);
});


// Exercise 6 - Arrays and Methods

events.push({
    name: "Workshop on Baking",
    date: "20 Aug",
    seats: 30,
    category: "workshop"
});

const musicEvents =
events.filter(
    event => event.category === "music"
);

console.log(musicEvents);

const formattedEvents =
events.map(
    event => `Event: ${event.name}`
);

console.log(formattedEvents);


// Exercise 7 - DOM Manipulation


const container =
document.querySelector(
    "#eventContainer"
);

events.forEach(event => {

    const card =
    document.createElement("div");

    card.textContent =
    event.name;

    container.appendChild(card);
});

// Exercise 8 - Event Handling

const listBox =
document.getElementById("listBox");

function show(list) {

    listBox.innerHTML = "";

    list.forEach(event => {

        listBox.innerHTML +=
        `<p>${event.name}</p>`;
    });
}

show(events);

document
.getElementById(
    "eventSearchInput"
)
.addEventListener(
    "keydown",
    function () {

        const value =
        this.value.toLowerCase();

        show(
            events.filter(
                event =>
                event.name
                .toLowerCase()
                .includes(value)
            )
        );
    }
);

document
.getElementById(
    "eventCategorySelect"
)
.onchange = function () {

    if (
        this.value === "all"
    ) {

        show(events);

    } else {

        show(
            events.filter(
                event =>
                event.category ===
                this.value
            )
        );
    }
};


// Exercise 9 - Async JS,
// Promises and Async Await


function loadEvents() {

    const spinner =
    document.getElementById(
        "spinner"
    );

    spinner.style.display =
    "block";

    fetch(
        "https://jsonplaceholder.typicode.com/posts?_limit=3"
    )
    .then(response =>
        response.json()
    )
    .then(data => {

        spinner.style.display =
        "none";

        document
        .getElementById(
            "communityOutput"
        )
        .innerHTML =
        data
        .map(
            item =>
            `<p>${item.title}</p>`
        )
        .join("");

    })
    .catch(error =>
        console.log(error)
    );
}

async function loadAsync() {

    const spinner =
    document.getElementById(
        "spinner"
    );

    spinner.style.display =
    "block";

    try {

        const response =
        await fetch(
            "https://jsonplaceholder.typicode.com/posts?_limit=3"
        );

        const data =
        await response.json();

        document
        .getElementById(
            "communityOutput"
        )
        .innerHTML =
        data
        .map(
            item =>
            `<p>${item.title}</p>`
        )
        .join("");

    }
    catch(error) {

        console.log(error);
    }
    finally {

        spinner.style.display =
        "none";
    }
}

// Exercise 10 - Modern JavaScript


function createEvent(
    name = "New Event"
) {

    console.log(name);
}

const {
    name,
    date,
    seats: seatCount
} = events[0];

console.log(
    name,
    date,
    seatCount
);

const clonedEvents =
[...events];


// Exercise 11 - Working with Forms


const form =
document.getElementById(
    "userForm"
);

form.onsubmit =
function (e) {

    e.preventDefault();

    const userName =
    form.elements[
        "userName"
    ].value;

    const userEmail =
    form.elements[
        "userEmail"
    ].value;

    if (
        userName === "" ||
        userEmail === ""
    ) {

        document
        .getElementById(
            "statusMsg"
        )
        .textContent =
        "All fields required";

        return;
    }

    document
    .getElementById(
        "statusMsg"
    )
    .textContent =
    "Sending...";

   
    // Exercise 12 - AJAX & Fetch API
   

    console.log(
        "Submitting form"
    );

    console.log({
        userName,
        userEmail
    });

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",

                headers: {
                    "Content-Type":
                    "application/json"
                },

                body: JSON.stringify({
                    userName,
                    userEmail
                })
            }
        )
        .then(() => {

            document
            .getElementById(
                "statusMsg"
            )
            .textContent =
            "Registration Successful";
        })
        .catch(() => {

            document
            .getElementById(
                "statusMsg"
            )
            .textContent =
            "Registration Failed";
        });

    }, 1000);
};



// Exercise 14 - jQuery and JS Frameworks


$("#registerBtn").click(
    function () {

        $("#statusText")
        .text(
            "Registered Successfully"
        );
    }
);

$("#showBtn").click(
    function () {

        $("#eventCard")
        .fadeIn();
    }
);

$("#hideBtn").click(
    function () {

        $("#eventCard")
        .fadeOut();
    }
);
