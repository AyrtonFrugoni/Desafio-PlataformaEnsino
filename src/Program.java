import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Video;
import entities.Task;
import entities.Lesson;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantas aulas tem o curso? ");
		int numLessons = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha após o número
		System.out.println();
		List<Lesson> lessons = new ArrayList<>();

		for (int i = 1; i <= numLessons; i++) {
			System.out.println("Dados da " + i + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			String type = scanner.nextLine();

			System.out.print("Título: ");
			String title = scanner.nextLine();

			if (type.equals("c")) {
				System.out.print("URL do vídeo: ");
				String url = scanner.nextLine();

				System.out.print("Duração em segundos: ");
				int seconds = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha após o número

				Video video = new Video(title, url, seconds);
				lessons.add(video);
			} else if (type.equals("t")) {
				System.out.print("Descrição: ");
				String description = scanner.nextLine();

				System.out.print("Quantidade de questões: ");
				int questionCount = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha após o número

				Task task = new Task(title, description, questionCount);
				lessons.add(task);
			}
			System.out.println();
		}

		int totalDuration = 0;

		for (Lesson lesson : lessons) {
			totalDuration += lesson.duration();
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");

		scanner.close();
	}
}
