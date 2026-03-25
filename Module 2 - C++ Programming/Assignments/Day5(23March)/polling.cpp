#include <iostream>
using namespace std;

// ── Get Votes ──────────────────────────────────────────────────────
void getVotes(int votes[], int numVoters, int numCandidates) {
    for (int i = 0; i < numVoters; i++) {
        cout << "Voter " << i + 1 << " - Enter candidate number (1 to " << numCandidates << "): ";
        cin  >> votes[i];
    }
}

// ── Count Votes Per Candidate ──────────────────────────────────────
void countVotes(int votes[], int numVoters, int counts[], int numCandidates) {
    for (int i = 0; i < numCandidates; i++) {
        counts[i] = 0;
    }
    for (int i = 0; i < numVoters; i++) {
        counts[votes[i] - 1]++;
    }
}

// ── Calculate Total Votes ──────────────────────────────────────────
int calcTotal(int numVoters) {
    return numVoters;
}

// ── Find Winner ────────────────────────────────────────────────────
int findWinner(int counts[], int numCandidates) {
    int winnerIndex = 0;
    for (int i = 1; i < numCandidates; i++) {
        if (counts[i] > counts[winnerIndex]) {
            winnerIndex = i;
        }
    }
    return winnerIndex;
}

// ── Find Runner-Up ─────────────────────────────────────────────────
int findRunnerUp(int counts[], int numCandidates, int winnerIndex) {
    int runnerIndex = -1;
    for (int i = 0; i < numCandidates; i++) {
        if (i == winnerIndex) continue;
        if (runnerIndex == -1 || counts[i] > counts[runnerIndex]) {
            runnerIndex = i;
        }
    }
    return runnerIndex;
}

// ── Display Results ────────────────────────────────────────────────
void displayResults(int counts[], int numCandidates, int winnerIndex, int runnerIndex, int total) {
    cout << "\n===== ELECTION RESULTS =====" << endl;
    for (int i = 0; i < numCandidates; i++) {
        cout << "  Candidate " << i + 1 << " : " << counts[i] << " votes" << endl;
    }
    cout << "----------------------------" << endl;
    cout << "  Total votes : " << total << endl;
    cout << "  Winner      : Candidate " << winnerIndex + 1
         << " (" << counts[winnerIndex] << " votes)" << endl;
    cout << "  Runner-up   : Candidate " << runnerIndex + 1
         << " (" << counts[runnerIndex] << " votes)" << endl;
    cout << "  Margin      : " << counts[winnerIndex] - counts[runnerIndex]
         << " votes" << endl;
}

// ── Main ───────────────────────────────────────────────────────────
int main() {
    int numCandidates, numVoters;

    cout << "Enter number of candidates : ";
    cin  >> numCandidates;
    cout << "Enter number of voters     : ";
    cin  >> numVoters;

    int votes[numVoters];
    int counts[numCandidates];

    getVotes(votes, numVoters, numCandidates);
    countVotes(votes, numVoters, counts, numCandidates);

    int total       = calcTotal(numVoters);
    int winnerIndex = findWinner(counts, numCandidates);
    int runnerIndex = findRunnerUp(counts, numCandidates, winnerIndex);

    displayResults(counts, numCandidates, winnerIndex, runnerIndex, total);

    return 0;
}