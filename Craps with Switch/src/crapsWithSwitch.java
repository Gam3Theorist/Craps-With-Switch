import java.util.Scanner;

public class crapsWithSwitch

	{
		public static void main(String[] args)
			{

				boolean playAgain = true;
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);
				int money = 1000;
				System.out.println("Welcome to craps, go ahead and test your luck.");
				while (playAgain)
					{

						playAgain = false;

						System.out.println("You have $" + money + ", how much would you like to wager?");
						int bet = userIntInput.nextInt();

						if (bet > money || bet < 0)
							{
								System.out.println("Listen man, you can't bet what you don't have. Try again.");
								playAgain = true;
								System.out.println("'Press enter to continue'");
								String tryAgain = userStringInput.nextLine();
							} else if (bet == 0)
							{
								System.out.println("Oooooh, um... Looks like you're broke. Come back anothet time...");
							} else
							{
								int firstDice = (int) ((Math.random() * 6) + 1);
								int secondDice = (int) ((Math.random() * 6) + 1);
								int roll = (firstDice + secondDice);
								System.out.println(
										+firstDice + " plus " + secondDice + " is " + (firstDice + secondDice) + ".");
								boolean rolling = true;
								switch (roll)

									{
										case 7:
										case 11:
											{
												System.out.println("Hey, seems like the gods are smiling at ya!");
												System.out.println(
														"You won " + bet + "! Your balance is now $" + (money + bet));
												money = money + bet;
												System.out.println("Would you like to play again?");
												System.out.println("1. yes");
												System.out.println("2. no");
												int playChoice = userIntInput.nextInt();
												if (playChoice == 1)

													{
														if (money <= 0)
															{
																System.out.println(
																		"You can't bet nothing. Come back another day.");
															} else
															{
																System.out.println("'Press enter to continue'");
																playAgain = true;
																String continue2 = userStringInput.nextLine();
															}
													} else
													{
														System.out.println("Thanks for playing!");

													}
												break;
											}

										case 2:
										case 12:
											{
													{
														System.out.println("Darn, that sucks. Try again next time.");
														System.out.println("You lost" + bet
																+ "... Your balance is now $" + (money - bet));
														money = money - bet;
														System.out.println("Would you like to play again?");
														System.out.println("1. yes");
														System.out.println("2. no");
														int playChoice2 = userIntInput.nextInt();
														if (playChoice2 == 1)
															{
																if (money <= 0)
																	{
																		System.out.println(
																				"You can't bet nothing. Come back another day.");
																	} else
																	{
																		System.out.println("'Press enter to continue'");
																		playAgain = true;
																		String continue2 = userStringInput.nextLine();
																	}
															} else if (playChoice2 == 2)
															{
																System.out.println("Thanks for playing!");

															}
														break;
													}
											}
										default:
											{
													{
														System.out.println("The point is now " + roll
																+ ", 7 will now make you lose.");
														System.out.println("Roll again.");
														System.out.println("'press enter to continue'");
														String enter2 = userStringInput.nextLine();
														playAgain = false;
													}
												while (rolling == true)
													{
														int firstDice2 = (int) ((Math.random() * 6) + 1);
														int secondDice2 = (int) ((Math.random() * 6) + 1);
														int secondRoll = (firstDice2 + secondDice2);
														System.out.println(+firstDice2 + " plus " + secondDice2 + " is "
																+ (firstDice2 + secondDice2) + ".");
														if (secondRoll == 7)
															{
																System.out.println("Oof, better luck next time.");
																System.out.println("You lost " + bet
																		+ "... Your balance is now $" + (money - bet));
																money = money - bet;
																rolling = false;
																System.out.println("Would you like to play again?");
																System.out.println("1. yes");
																System.out.println("2. no");
																int playChoice3 = userIntInput.nextInt();
																if (playChoice3 == 1)
																	{
																		if (money <= 0)
																			{
																				System.out.println(
																						"You can't bet nothing. Come back another day.");
																			} else
																			{
																				System.out.println(
																						"'Press enter to continue'");
																				playAgain = true;
																				String continue3 = userStringInput
																						.nextLine();
																			}
																	} else if (playChoice3 == 2)
																	{
																		System.out.println("Thanks for playing!");
																		rolling = false;
																		playAgain = false;
																	}
															}

														else if (secondRoll == roll)
															{
																System.out.println("Congrats! You win!");
																System.out.println("You won " + bet
																		+ "! Your balance is now $" + (money + bet));
																money = money + bet;
																rolling = false;
																System.out.println("Would you like to play again?");
																System.out.println("1. yes");
																System.out.println("2. no");
																int playChoice4 = userIntInput.nextInt();
																if (playChoice4 == 1)
																	{
																		if (money <= 0)
																			{
																				System.out.println(
																						"You can't bet nothing. Come back another day.");
																			} else
																			{
																				System.out.println(
																						"'Press enter to continue'");
																				playAgain = true;
																				String continue4 = userStringInput
																						.nextLine();
																			}
																	} else if (playChoice4 == 2)
																	{
																		System.out.println("Thanks for playing!");
																		rolling = false;

																		playAgain = false;

																	}
															} else
															{
																System.out.println("Keep trying buddy.");
																System.out.println("'press enter to continue'");
																String enter3 = userStringInput.nextLine();
															}
													}
											}
									}
							}
					}
			}
	}
