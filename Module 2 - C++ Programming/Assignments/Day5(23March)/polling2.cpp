#include <iostream>
#include <string>
using namespace std;

// ── Constants ──────────────────────────────────────────────────────
const int NUM_CANDIDATES = 5;

// ── Party Names (fixed) ────────────────────────────────────────────
string partyNames[NUM_CANDIDATES] = {"BJP", "INC", "AAP", "DMK", "ADMK"};

// ── Store voter names and their votes ─────────────────────────────
string voterNames[100];
int    voterChoices[100];
int    numVoters = 0;

// ── Count array ────────────────────────────────────────────────────
int counts[NUM_CANDIDATES] = {0, 0, 0, 0, 0};

// ── Display Menu ───────────────────────────────────────────────────
void displayMenu() {
    cout << "\n========================================" << endl;
    cout << "         VOTING SYSTEM MENU             " << endl;
    cout << "========================================" << endl;
    cout << "  1. Cast Vote                          " << endl;
    cout << "  2. View All Votes (Voter + Choice)    " << endl;
    cout << "  3. View Results                       " << endl;
    cout << "  4. Exit                               " << endl;
    cout << "========================================" << endl;
    cout << "  Enter your choice: ";
}

// ── Display Parties ────────────────────────────────────────────────
void displayParties() {
    cout << "\n  ---- Candidates ----" << endl;
    for (int i = 0; i < NUM_CANDIDATES; i++) {
        cout << "  " << i + 1 << ". " << partyNames[i] << endl;
    }
    cout << "  --------------------" << endl;
}

// ── Cast Vote ──────────────────────────────────────────────────────
void castVote() {
    if (numVoters >= 100) {
        cout << "  Voter limit reached!" << endl;
        return;
    }

    string name;
    int    choice;

    cout << "\n  Enter your name       : ";
    cin.ignore();
    getline(cin, name);

    // check duplicate voter
    for (int i = 0; i < numVoters; i++) {
        if (voterNames[i] == name) {
            cout << "  " << name << " has already voted!" << endl;
            return;
        }
    }

    displayParties();
    cout << "  Enter candidate number (1 to " << NUM_CANDIDATES << "): ";
    cin  >> choice;

    if (choice < 1 || choice > NUM_CANDIDATES) {
        cout << "  Invalid choice!" << endl;
        return;
    }

    // store voter name and choice
    voterNames[numVoters]   = name;
    voterChoices[numVoters] = choice;
    numVoters++;

    // update count
    counts[choice - 1]++;

    cout << "  Vote cast successfully for " << partyNames[choice - 1] << "!" << endl;
}

// ── View All Votes ─────────────────────────────────────────────────
void viewAllVotes() {
    if (numVoters == 0) {
        cout << "\n  No votes cast yet!" << endl;
        return;
    }

    cout << "\n========================================" << endl;
    cout << "         VOTER LIST                     " << endl;
    cout << "========================================" << endl;
    cout << "  No.  Voter Name         Party Voted   " << endl;
    cout << "----------------------------------------" << endl;
    for (int i = 0; i < numVoters; i++) {
        cout << "  " << i + 1 << ".   "
             << voterNames[i];
        // padding for alignment
        for (int s = voterNames[i].length(); s < 18; s++) cout << " ";
        cout << partyNames[voterChoices[i] - 1] << endl;
    }
    cout << "----------------------------------------" << endl;
    cout << "  Total voters : " << numVoters << endl;
}

// ── Find Winner ────────────────────────────────────────────────────
int findWinner() {
    int winnerIndex = 0;
    for (int i = 1; i < NUM_CANDIDATES; i++) {
        if (counts[i] > counts[winnerIndex]) {
            winnerIndex = i;
        }
    }
    return winnerIndex;
}

// ── Find Runner Up ─────────────────────────────────────────────────
int findRunnerUp(int winnerIndex) {
    int runnerIndex = -1;
    for (int i = 0; i < NUM_CANDIDATES; i++) {
        if (i == winnerIndex) continue;
        if (runnerIndex == -1 || counts[i] > counts[runnerIndex]) {
            runnerIndex = i;
        }
    }
    return runnerIndex;
}

// ── View Results ───────────────────────────────────────────────────
void viewResults() {
    if (numVoters == 0) {
        cout << "\n  No votes cast yet!" << endl;
        return;
    }

    int winnerIndex = findWinner();
    int runnerIndex = findRunnerUp(winnerIndex);
    int diff        = counts[winnerIndex] - counts[runnerIndex];

    cout << "\n========================================" << endl;
    cout << "         ELECTION RESULTS               " << endl;
    cout << "========================================" << endl;
    for (int i = 0; i < NUM_CANDIDATES; i++) {
        cout << "  " << partyNames[i];
        // padding for alignment
        for (int s = partyNames[i].length(); s < 10; s++) cout << " ";
        cout << ": " << counts[i] << " votes";
        if (i == winnerIndex) cout << "  <-- WINNER";
        if (i == runnerIndex) cout << "  <-- Runner-up";
        cout << endl;
    }
    cout << "----------------------------------------" << endl;
    cout << "  Total votes : " << numVoters                           << endl;
    cout << "  Winner      : " << partyNames[winnerIndex]
         << " (" << counts[winnerIndex] << " votes)"                  << endl;
    cout << "  Runner-up   : " << partyNames[runnerIndex]
         << " (" << counts[runnerIndex] << " votes)"                  << endl;
    cout << "  Margin      : " << diff << " votes"                    << endl;
    cout << "========================================" << endl;
}

// ── Main ───────────────────────────────────────────────────────────
int main() {
    int choice;

    cout << "\n  Welcome to the Voting System!" << endl;

    do {
        displayMenu();
        cin >> choice;

        switch (choice) {
            case 1: castVote();     break;
            case 2: viewAllVotes(); break;
            case 3: viewResults();  break;
            case 4: cout << "\n  Exiting... Thank you!\n" << endl; break;
            default: cout << "\n  Invalid option! Try again." << endl;
        }

    } while (choice != 4);

    return 0;
}