package com.revature;

import org.apache.log4j.Logger;

import com.revature.services.UserInterface;

public class Driver {
	private static Logger logger = Logger.getLogger(Driver.class);
	
	public static void main(String[] args) {
		System.out.println("                              .                                                                                                           \r\n" + 
				"       7NDDD888O$I:                   .             ...       +NDMMI         DNDDD888OZ7~ .           .  .    . .       .NNNM8              \r\n" + 
				"       7MMMMMMMMMMMO:  .             .          .            .+MMMMI         DMMMMD8DMMMM8.                         .   .MMMM8              \r\n" + 
				"       7MMMM8   7MMMMI             .                       .  +MMMMI         DMMMMI   NMMMM.                  .         .MMMMD              \r\n" + 
				"       7MMMM8   ?MMMMZ  .$MMMNMMZ,  MMMMM7    MI :8MO8MMMM8,  +MMMMI         DMMMMI   DMMMM: ,OMOOMMMMD~  ,MMMMD,ZMMM7  .MMMMN.   OM+       \r\n" + 
				"       7MMMM8   $MMMM? .NMMM:,MMMM: 7MMMMN    M  NM= .?MMMMZ  +MMMMI         DMMMMI  :MMMMO  8M?  ~MMMM8  ,MMMMNDMMMMM: .MMMMN   $MI        \r\n" + 
				"       7MMMMMMMMMMN?   MMMMZ  7MMMM~ 8MMMM$  Z: :MM,  ~MMMMN  +MMMMI         DMMMMMMMMMMI    MM+  ,DMMMM. ,MMMMM: ?MMM= .MMMMN =MM.         \r\n" + 
				"       7MMMMNIZMMM8~   MMMM$  ?MMMM+ +MMMMM .M.   , .IMMMMMN  +MMMMI         DMMMM8I$NMMM8~   .. +DMMMMM. ,MMMM8  ?MMM+ .MMMMM:MMMI         \r\n" + 
				"       7MMMM8. ,MMMM8. MMMM7  +MMMM$  $MMMMZMM   $MMM$ MMMMN  +MMMMI         DMMMMI   IMMMMO IMMMO DMMMM. ,MMMMZ  ?MMM+ .MMMMMMMMMM=        \r\n" + 
				"       7MMMM8   NMMMM: MMMM$  ?MMMM+   8MMMMM:  MMMMZ  DMMMN  +MMMMI         DMMMMI   =MMMMM MMMD  ZMMMM. ,MMMMO  ?MMM+ .MMMMZ MMMMM,   .   \r\n" + 
				"       7MMMM8   NMMMM= NMMMO  7MMMM:   ?MMMMZ  ,MMMMZ. NMMMN  +MMMMI        .DMMMMI   ?MMMM8 MMMD  OMMMM. ,MMMMO  ?MMM+ .MMMMO ZMMMM7       \r\n" + 
				"       7MMMM8   8MMMMD  OMMM+~MMM8.     ZMMD    $MMMMZ8NMMMM77+MMMMI         DMMMM87$DMMMMO  MMMMZNNMMMM$Z,MMMM8  IMMM+ .MMMM8  DMMMM+      \r\n" + 
				"        .....    .....     ,~~,          DM,      .~~.   .:,   .... .        .........        .:~.    :,   .....   ...   .                  \r\n" + 
				"            .     .   .                 .MZ             .                            .                                   .                  \r\n" + 
				"                                .   :MM8M7                                                                                                  \r\n" + 
				"                                 .   =7O?                                                                                                   \r\n" + 
				"                                             .                                                                                              \r\n" + 
				"                                            .                                                                                               \r\n" + 
				"                                                                                                                                            \r\n" + 
				"               .                               .                                                            .                               \r\n" + 
				"           .     .     8MMDI.        ONDDD888OI,        .                                     ,.        .               .                   \r\n" + 
				"       .              8M$ OM+        OMMMMZ .IMMMZ             .                           +DMM:  .  .   .                                  \r\n" + 
				"          .~+?=,   .::MMM7::         OMMMMZ   MMMM7    ..=I+:    :::::    ::   .+?7I?~   .:ZMMM~:. ~=?I+  ,~=?I:  ,:?I ~I= .    ~??~.    .  \r\n" + 
				"         7MMMDMMO:  8MMMMMMZ    .    OMMMMZ   MMMMI    IMMMMMO. ,MMMMM    8M .7MM8MMMMN= =MMMMMMM==MMMM7 .$MMMM~ ,MMM8IMMMI.  +NMMMMD~      \r\n" + 
				"       ?MMMM  7MMM8   MMMD           OMMMMZ.:$MMM$   ?MMM$ .MMM? IMMMM   IM: OM+  .7MMMM=  $MMM:  =MMMM7  $MMMM~ ,MMMM=OMMO :MMMD  8MMZ     \r\n" + 
				"      .MMMMO  =MMMMI  MMMD           OMMMMDIZMMZ:   =MMMM?  NMMM, DMMM? ,MI   .: ~8MMMMM=  $MMM:  =MMMMI  7MMMM~ ,MMMO 8OO? MMMMZ  $MMM?    \r\n" + 
				"    . :MMMMO  ~MMMMZ .MMMD           OMMMMZ  $MMN~  ?MMMMDOONMMM~ IMMM8 IM,   ,?DMNZMMMM=  $MMM:  =MMMMI .7MMMM~ ,MMM$     :MMMMNOONMMM7    \r\n" + 
				"      :MMMMO  ~MMMM$  MMMD           OMMMMZ  :MMMD. IMMMMI     .   8MMM+MI  :MMMM+ 7MMMM=  $MMM:  =MMMMI  $MMMM~ ,MMMZ     ~MMMM8           \r\n" + 
				"       MMMM8  =MMMMI  MMMD           OMMMMZ  ,MMMM. +MMMM7    O7,. ?MMMNM,  7MMMM: 7MMMM=  $MMM:  =MMMMI  ZMMMM~ ,MMMZ.    ,MMMM8    +Z+    \r\n" + 
				"       =MMMM. 7MMMZ   MMMD           OMMMMZ  .MMMM=  ZMMMN    8N    OMMMI   7MMMM= OMMMM=  7MMM:  :MMMMO 7MMMMM~ ,MMMO      ?MMMM+   7M~    \r\n" + 
				"        .+NMMMMM7.    MMMD           OMMMMZ   MMMMM   .$MMMMMD+      MM8     +NMMM8,?MMMNO: 7MMDI  +NMMMZ,$MMMM~ ,MMMO        ?NMMMMMI      \r\n" + 
				"           .~=,                    . ......   .. ..      ,~~,        ...      .~=,   .~,     :,      :~:                        ,~=:.       \r\n" + 
				"                             .                               .                                        .                                     \r\n" + 
				"                                 .  .                                         .  . .                       .            .        .          \r\n" + 
				"                                                                              8MMM                           .                              \r\n" + 
				"                                                                           MMMMMM      =.                               .                   \r\n" + 
				"                                                                         $MMMMMM    NMM                            .                        \r\n" + 
				"                                                                       MMMMMMMM$ MMMMM                     .       N   .                    \r\n" + 
				"                                                             ZMMMMMMM.MMMMMMMMMMMMMMM                       NMMM=                           \r\n" + 
				"                                                           MMMMMMMMM.MMMMMMMMMMMMMMMM .         .       =MMMMM                              \r\n" + 
				"                                                 .    =MMMMMMMMMMMMMMMMMMMMMMMMMMMM              ?MMMMMMMM   .                              \r\n" + 
				"                                                     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.        MMMMMMMMMM          .                         \r\n" + 
				"                                                  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8NMMMMMMMMMMM            ..                          \r\n" + 
				"                                                MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                            \r\n" + 
				"                                              .MMMMMM+.:MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8MMMM   .                                          \r\n" + 
				"                                              MM    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN                                                 \r\n" + 
				"                                            =+   MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8                                                 \r\n" + 
				"                                               8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                                 \r\n" + 
				"                                              MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.MMMM                                                 \r\n" + 
				"                                             MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ MMM                                                 \r\n" + 
				"                                           ZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                                 \r\n" + 
				"                                          MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                                 \r\n" + 
				"                                          MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                                \r\n" + 
				"                                         MMMMMMMMMMMMMMMMMMMMMMMMMMMM.NMMMMMMMMMMMMMMMMMMMMM                                                \r\n" + 
				"                                        DMMMMMMMMMMMMMMMMMMMMMMMMMMMM  MMMMMMMMMMMMMMMMMMMMMM                                               \r\n" + 
				"                                        MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM  8MMMMMMMMMMMMMMMMMMMM                                               \r\n" + 
				"                                        MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM         MMMMMMMMMMMMMM                                               \r\n" + 
				"                                       +MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?          MMMMMMMMMMMM.                                              \r\n" + 
				"                                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM          ZMMMMMMMMMMM  .                                           \r\n" + 
				"                                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM        OMMMMMMMMMM                                              \r\n" + 
				"                                       8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM        MMMMMMMMMM                                              \r\n" + 
				"                                      . MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM      MMMMMMMMMM                                              \r\n" + 
				"                                        MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM     OMM=MMMMMM                                              \r\n" + 
				"                                      . MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM   . MMM MMMM                                               \r\n" + 
				"                                      .  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                                           \r\n" + 
				"                                         MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM      .      .                                            \r\n" + 
				"                                          NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMD    .                                                    \r\n" + 
				"                                           MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                                         \r\n" + 
				"                                            ZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM    ..                                                   \r\n" + 
				"                                              MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM~                                                        \r\n" + 
				"                                              $MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?                                                        \r\n" + 
				"                                                 MMMMMMMMMMMMMMMMM.?MMMMMMMMMMMMMMM=                                                        \r\n" + 
				"                                                   .NMMMMMMMMMMMMMMI  MMMMMMMMMMMMM                                                         \r\n" + 
				"                                                      NMMMMMMMMMMMMM DMMMMMMMMMMMMM                                                         \r\n" + 
				"                                                           MMMMMMMMMMMMMMMMMMMMMMMM                                                         \r\n" + 
				"                                                             $MMMMMMMMMMMMMMMMMMMMM                                                         \r\n" + 
				"                                              .           $MMMMMMM?MMMMMMMMMMMMMMM                                                          \r\n" + 
				"                                                      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM   .                                                  \r\n" + 
				"                                                    MMMMMMMMMMMMMMMMMMMMMM8MMMMMMMMMMMMM                                                    \r\n" + 
				"                                           .    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+                                               \r\n" + 
				"                                 .          DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN                                            \r\n" + 
				"                                .    .    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                          \r\n" + 
				"                                    . MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMMMMMMMMMMMMMMMMMMMMM    .                                 \r\n" + 
				"                                    MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                                    \r\n" + 
				"                               8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMD                               \r\n" + 
				"                          .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                           \r\n" + 
				"                         MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                         \r\n" + 
				"                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.                       \r\n" + 
				"                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                        \r\n" + 
				"                              DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                              \r\n" + 
				"                               MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM          .                    \r\n" + 
				"                                IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM7       .  .                     \r\n" + 
				"                            .                                                                                                               \r\n" + 
				"                                                        .                                                                                   \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM.     MMMMMMMMMMM=.      MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM .      MMMMMMMMMMM .  . MMMMMMMMMMM+       MMMMMMMMMM .                                    \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+     . MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM    .   MMMMMMMMMMM   .  MMMMMMMMMMM=  .    MMMMMMMMMM    .                                 \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=     . MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=    .  MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+ .     MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+    .  MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM=    .  MMMMMMMMMM                                      \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM           .                          \r\n" + 
				"                                      MMMMMMMMMM        MMMMMMMMMMM      MMMMMMMMMMM+       MMMMMMMMMM                                      \r\n" + 
				"                               .  +??+MMMMMMMMMM+??++??IMMMMMMMMMMM+??++?MMMMMMMMMMM7++??++?MMMMMMMMMM?++?=                                 \r\n" + 
				"                                MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM~                               \r\n" + 
				"                              7MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8                              \r\n" + 
				"                              NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                              \r\n" + 
				"                              NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM   .                          \r\n" + 
				"                                                                                                                                            \r\n" + 
				"                                                                                                                                            \r\n" + 
				"                                                                                                                                            \r\n" + 
				"                       7MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM    .                   \r\n" + 
				"                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                        \r\n" + 
				"                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM     .                  \r\n" + 
				"                       MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM                        \r\n" + 
				"                                                                                                                                            \r\n" + 
				"                                                                                                                                       ");
		System.out.println("Welcome to Her Majesty's Royal Bank of Revature. What would you like to do?");
		logger.info("Application Started");
		UserInterface.entrySwitch(UserInterface.entryScreen());
	}
	
}
