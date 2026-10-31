# Contributing to Overflow Browser

Thank you for your interest in contributing to Overflow Browser! This document outlines our development process, architecture principles, and contribution guidelines.

## Philosophy

- **Lightweight & Fast**: Minimize APK size and memory overhead. Avoid heavy third-party dependencies where standard Android and Kotlin capabilities suffice.
- **Privacy by Design**: No telemetry, no remote analytics, no background tracking, and no cloud account synchronization. All browsing state remains on the device.
- **Modern Android Stack**: Built with 100% Kotlin, Jetpack Compose, Material Design 3, Coroutines, StateFlow, and modern Android WebView APIs.

## Project Structure

```
app/src/main/
├── AndroidManifest.xml
├── assets/
│   └── adblock_hosts.txt        # Built-in adblock host filter list
├── java/com/overflow/browser/
│   ├── AppContainer.kt          # Manual dependency injection container
│   ├── MainActivity.kt          # Host Activity with edge-to-edge support
│   ├── OverflowBrowserApp.kt    # Application class
│   ├── browser/                 # WebView clients, tab state, adblock, reader mode
│   ├── data/                    # JSON file stores, settings DataStore, repositories
│   ├── ui/                      # Jetpack Compose UI (screens, components, theme)
│   └── util/                    # URL sanitization, date/time formatting
└── res/                         # Vector drawables, themes, mipmaps, strings
```

## Pull Request Guidelines

1. **One Focused Change per PR**: Each PR should address a single feature, bug fix, test, or documentation improvement.
2. **Commit Messages**: Follow standard Conventional Commits conventions:
   - `feat(...)`: A new feature or component
   - `fix(...)`: A bug fix
   - `docs(...)`: Documentation updates
   - `test(...)`: Adding or updating tests
   - `ci(...)`: GitHub Actions or automation improvements
   - `refactor(...)`: Code refactoring without behavior change
3. **Co-Authorship**: We encourage pairing and co-authorship. Include `Co-authored-by: Name <email>` commit trailers for pair contributions.
4. **Target Branch**: Base all pull requests on the `main` branch.

## License

By contributing to Overflow Browser, you agree that your contributions will be licensed under the [Apache License 2.0](LICENSE).
