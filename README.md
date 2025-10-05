## 🗂️ Personal Task Organizer 

A simple Java console application demonstrating task management, observer pattern notifications, functional predicates, and basic reflection utilities.

### Features ✨
- ➕ Add tasks with name, description, and priority
- 🔄 Update task status (TO_DO, IN_PROGRESS, COMPLETED)
- 🔔 Console notifications when tasks are created/updated
- 🧠 Functional filters for tasks (completed / in progress)
- 🔎 Reflection examples for inspecting classes

### Project Structure 🧭
- 📄 `src/com/taskorganizer/main/TaskOrganizerApplication.java`: Example entry point that adds and updates tasks.
- 📦 `src/com/taskorganizer/model/`: Core models (`Task`, `TaskPriority`, `TaskStatus`).
- 🛠️ `src/com/taskorganizer/service/`: `TaskManager` orchestrates tasks and notifications; `TaskService` shows list operations.
- 👀 `src/com/taskorganizer/observer/`: Observer interface and `TaskNotificationService` implementation.
- 🧩 `src/com/taskorganizer/functional/TaskPredicates.java`: Predicates to filter tasks with Java streams.
- 🪞 `src/com/taskorganizer/reflection/`: Reflection demos (`ReflectionAnalyzer`, `ReflectionTest`).

### Prerequisites ✅
- ☕ Java 17+ (tested on a modern JDK)
- 💻 PowerShell (for the provided build script on Windows)

### Build and Run (Windows PowerShell) ▶️
From the project root:

```powershell
./build.ps1 -RunMain
```

This compiles sources into `out/production/Personal Task Organizer` and runs `com.taskorganizer.main.TaskOrganizerApplication`.

To build only:

```powershell
./build.ps1
```

To run a different main class (e.g., reflection demo):

```powershell
./build.ps1 -RunMain -MainClass com.taskorganizer.reflection.ReflectionAnalyzer
```

### Manual Compile/Run (without script) 🧪

```powershell
# Compile
Remove-Item -Recurse -Force 'out/production/Personal Task Organizer' -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force 'out/production/Personal Task Organizer' | Out-Null
$files = Get-ChildItem -Path 'src' -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -d 'out/production/Personal Task Organizer' $files

# Run
java -cp 'out/production/Personal Task Organizer' com.taskorganizer.main.TaskOrganizerApplication
```

### Notes 📝
- If you’re using an IDE like IntelliJ IDEA, open the project and set the project SDK to a compatible JDK, then run `TaskOrganizerApplication`.
- The project avoids using variable names that conflict with team conventions.


### Advanced Java/Software Engineering Areas Used 🚀
- 🧱 Object-Oriented Design: clear domain models (`Task`, enums), encapsulation via getters/setters
- 🧩 Design Pattern – Observer: `TaskObserver` interface and `TaskNotificationService` implementation for event updates
- 🧠 Functional Programming: lambdas, predicates, streams, method references (`System.out::println`)
- 🪞 Reflection API: runtime class inspection in `reflection` package
- 🧭 Layered Structure: separation of concerns across `model`, `service`, `observer`, `functional`, `main`
- 🔗 Interfaces & Loose Coupling: behavior defined via `TaskObserver` to decouple notifications from task management
- 📚 Collections & Generics: `List<Task>` management and safe returns (`new ArrayList<>(tasks)`)
- 🛡️ Basic Error Handling: guarded access and try/catch in reflection demos
- 🧪 Executable Demos: small, focused mains to demonstrate each concept


