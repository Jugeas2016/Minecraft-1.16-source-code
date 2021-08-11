/*     */ import com.mojang.bridge.game.GameVersion;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import io.netty.util.ResourceLeakDetector;
/*     */ import java.time.Duration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class w
/*     */ {
/*  90 */   public static final ResourceLeakDetector.Level a = ResourceLeakDetector.Level.DISABLED;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   public static final long b = Duration.ofMillis(300L).toNanos();
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean c = true;
/*     */ 
/*     */   
/*     */   public static boolean d;
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(char ☃) {
/* 107 */     return (☃ != '§' && ☃ >= ' ' && ☃ != '');
/*     */   }
/*     */   
/* 110 */   public static final char[] e = new char[] { '/', '\n', '\r', '\t', Character.MIN_VALUE, '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':' };
/*     */ 
/*     */ 
/*     */   
/*     */   private static GameVersion f;
/*     */ 
/*     */ 
/*     */   
/*     */   public static String a(String ☃) {
/* 119 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/* 121 */     for (char c : ☃.toCharArray()) {
/* 122 */       if (a(c)) {
/* 123 */         stringBuilder.append(c);
/*     */       }
/*     */     } 
/*     */     
/* 127 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static GameVersion a() {
/* 141 */     if (f == null) {
/* 142 */       f = q.a();
/*     */     }
/* 144 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int b() {
/* 151 */     return 754;
/*     */   }
/*     */   
/*     */   static {
/* 155 */     ResourceLeakDetector.setLevel(a);
/* 156 */     CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
/* 157 */     CommandSyntaxException.BUILT_IN_EXCEPTIONS = new cx();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */