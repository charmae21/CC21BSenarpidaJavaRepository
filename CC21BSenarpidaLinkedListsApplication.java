
package com.mycompany.cc21bsenarpidalinkedlistsapplication;

import java.util.Scanner;

class Playlist {
    private static class Node {
        String songName;
        Node prev, next;

        Node(String songName) {
            this.songName = songName;
            this.prev = null;
            this.next = null;
        }
    }

    private Node current;

    // Add a song to the playlist
    public void addSong(String songName) {
        Node newNode = new Node(songName);

        if (current == null) {
            current = newNode;
            current.next = current;
            current.prev = current;
        } else {
            Node last = current.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = current;
            current.prev = newNode;
        }

        System.out.println("Added song: " + songName);
    }

    // Remove the current song from the playlist
    public void removeCurrentSong() {
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        String removedSong = current.songName;

        if (current.next == current) {
            current = null; // Last song removed
        } else {
            Node prevNode = current.prev;
            Node nextNode = current.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            current = nextNode;
        }

        System.out.println("Removed song: " + removedSong);
    }

    // Move to the next song
    public void nextSong() {
        if (current != null) {
            current = current.next;
            System.out.println("Now playing: " + current.songName);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current != null) {
            current = current.prev;
            System.out.println("Now playing: " + current.songName);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Display the current song and the full playlist
    public void displayPlaylist() {
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Current song: " + current.songName);
        System.out.println("Full Playlist:");

        Node temp = current;
        do {
            System.out.println("- " + temp.songName);
            temp = temp.next;
        } while (temp != current);
    }
}

public class CC21BSenarpida1LinkedListsApplication {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMusic Playlist Menu:");
            System.out.println("1. Add a song");
            System.out.println("2. Remove current song");
            System.out.println("3. Next song");
            System.out.println("4. Previous song");
            System.out.println("5. Display playlist");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song name: ");
                    String songName = scanner.nextLine();
                    playlist.addSong(songName);
                }
                case 2 -> playlist.removeCurrentSong();
                case 3 -> playlist.nextSong();
                case 4 -> playlist.previousSong();
                case 5 -> playlist.displayPlaylist();
                case 6 -> {
                    System.out.println("Exiting playlist...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
