<p align="center">
  <img src="https://img.shields.io/badge/🐼-PANDA-black?style=for-the-badge&labelColor=000000" alt="Panda" />
</p>

<h1 align="center">
  <br>
  🐼 Panda
  <br>
</h1>

<h3 align="center">
  <em>Your Personal AI Phone Operator</em>
</h3>

<p align="center">
  <strong>You touch grass. I'll touch your glass.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white" />
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white" />
  <img src="https://img.shields.io/badge/Gemini_AI-4285F4?style=flat-square&logo=google&logoColor=white" />
  <img src="https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square" />
  <img src="https://img.shields.io/github/license/piashmsu/blurr?style=flat-square" />
</p>

<p align="center">
  <a href="https://discord.gg/b2hxFNXvWk">
    <img src="https://img.shields.io/badge/Discord-Join%20Community-5865F2?style=for-the-badge&logo=discord&logoColor=white" />
  </a>
</p>

---

## ✨ What is Panda?

**Panda** is a proactive, on-device AI agent for Android that autonomously understands natural language commands and operates your phone's UI to achieve them.

> 🗣️ *"Send a welcome message to all new LinkedIn connections"*  
> 🐼 Panda does it. Hands-free.

---

## 🎬 Demos

| Demo | Link |
|------|------|
| 🎯 All Triggers Explained | [![Watch](https://img.shields.io/badge/YouTube-Watch-red?style=flat-square&logo=youtube)](https://www.youtube.com/embed/IDvuqmPyKZs) |
| 💼 LinkedIn Auto-Welcome | [![Watch](https://img.shields.io/badge/YouTube-Watch-red?style=flat-square&logo=youtube)](https://www.youtube.com/embed/JO_EWFYJJjA) |

---

## 🧠 Core Features

```
┌─────────────────────────────────────────────────┐
│  🤖  Intelligent UI Automation                  │
│  📢  High Quality Voice (Google Chirp TTS)      │
│  🎯  Custom Triggers & Wake Word ("Hey Panda")  │
│  🔑  Bring Your Own API Key                     │
│  🔓  All Features Unlocked                      │
└─────────────────────────────────────────────────┘
```

- **🧠 Smart Screen Control** — Sees the screen, understands context, taps/swipes/types autonomously
- **📢 Natural Voice** — High quality speech powered by Google Cloud Chirp
- **🎯 Custom Triggers** — Set up automated workflows triggered by events
- **🔑 BYOK (Bring Your Own Key)** — Enter your Gemini API key directly in Settings
- **♾️ Unlimited Usage** — No task limits, no premium gates

---

## 🏗️ Architecture

```
┌──────────────────────────────────────────┐
│              🐼 PANDA AGENT              │
├──────────────────────────────────────────┤
│                                          │
│   👁️ Eyes & Hands                        │
│   └── Android Accessibility Service      │
│       (reads screen + performs gestures)  │
│                                          │
│   🧠 Brain                               │
│   └── Gemini LLM                         │
│       (reasoning + planning + analysis)  │
│                                          │
│   🎬 Operator                            │
│   └── Agent Executor with Notepad        │
│       (task execution + state tracking)  │
│                                          │
└──────────────────────────────────────────┘
```

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest)
- Android device/emulator API 26+
- Gemini API key ([get one free](https://aistudio.google.com/apikey))

### Installation

```bash
git clone https://github.com/piashmsu/blurr.git
cd blurr
```

1. Open in Android Studio
2. Let Gradle sync
3. Build & Run on your device
4. **Enable Accessibility Service** when prompted
5. Go to **Settings → Enter your Gemini API key → Save**

> 💡 That's it! No `local.properties` editing needed. Just paste your key in the app.

---

## ⚙️ API Configuration

You can provide your API key in two ways:

| Method | How |
|--------|-----|
| **In-App (Recommended)** | Settings → Gemini API Key → Paste → Save |
| **local.properties** | `GEMINI_API_KEYS=your_key_here` |

Multiple keys supported (comma-separated) for better rate limiting.

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|-----------|
| Language | Kotlin |
| UI | Jetpack Compose + XML |
| AI | Google Gemini |
| Voice | Google Cloud Chirp TTS |
| Wake Word | Picovoice Porcupine |
| Database | Room |
| Auth | Firebase Auth |
| Build | Gradle (KTS) |

---

## 📁 Project Structure

```
blurr/
├── app/src/main/java/com/blurr/voice/
│   ├── v2/                    # Agent v2 (LLM, executor)
│   ├── api/                   # API clients (Gemini, TTS)
│   ├── triggers/              # Trigger system
│   ├── utilities/             # Managers & helpers
│   ├── MainActivity.kt
│   ├── SettingsActivity.kt
│   └── ScreenInteractionService.kt
├── docs/                      # Documentation
├── gradle/                    # Build config
└── README.md
```

---

## 🤝 Contributing

Contributions welcome! Open an issue or submit a PR.

---

## 📜 License

Personal & Educational Use — Free to use, modify, and distribute for non-commercial purposes.

See [LICENSE](./LICENSE) for details.

---

<p align="center">
  <strong>Built with 🐼 by the community</strong>
  <br>
  <sub>Fork of <a href="https://github.com/Ayush0Chaudhary/blurr">Ayush0Chaudhary/blurr</a></sub>
</p>
