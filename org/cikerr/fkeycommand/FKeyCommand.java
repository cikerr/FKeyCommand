����   4 b
      !org/bukkit/plugin/java/JavaPlugin <init> ()V
  	 
   "org/cikerr/fkeycommand/FKeyCommand saveDefaultConfig
     reloadConfig
     	getServer ()Lorg/bukkit/Server;      org/bukkit/Server getPluginManager #()Lorg/bukkit/plugin/PluginManager;      org/bukkit/plugin/PluginManager registerEvents 8(Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V
    ! " 	getLogger ()Ljava/util/logging/Logger; $ FKeyCommand включен!
 & ' ( ) * java/util/logging/Logger info (Ljava/lang/String;)V , FKeyCommand выключен!
  
  / 0 1 	getConfig 3()Lorg/bukkit/configuration/file/FileConfiguration; 3 command 5 say Привет!
 7 8 9 : ; /org/bukkit/configuration/file/FileConfiguration 	getString 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;	  = 3 > Ljava/lang/String;
 @ A B C D org/bukkit/Bukkit getConsoleSender +()Lorg/bukkit/command/ConsoleCommandSender;
 @ F G H dispatchCommand 7(Lorg/bukkit/command/CommandSender;Ljava/lang/String;)Z
 J K L M N 0org/bukkit/event/player/PlayerSwapHandItemsEvent setCancelled (Z)V P org/bukkit/event/Listener Code LineNumberTable LocalVariableTable this $Lorg/cikerr/fkeycommand/FKeyCommand; onEnable 	onDisable config 1Lorg/bukkit/configuration/file/FileConfiguration; onPlayerSwapHandItems 5(Lorg/bukkit/event/player/PlayerSwapHandItemsEvent;)V event 2Lorg/bukkit/event/player/PlayerSwapHandItemsEvent; RuntimeVisibleAnnotations Lorg/bukkit/event/EventHandler; 
SourceFile FKeyCommand.java !    O   3 >        Q   /     *� �    R       
 S        T U    V   Q   \     "*� *� *� �  **�  *� #� %�    R              !  S       " T U    W   Q   8     
*� +� %�    R   
     	  S       
 T U       Q   V     *� -*� .L*+24� 6� <�    R          	    S        T U   	  X Y   Z [  Q   M     � ?*� <� EW+� I�    R       #  $  % S        T U      \ ]  ^     _    `    a