/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Calendar;
/*    */ import java.util.Collections;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekt
/*    */   extends ack<List<String>>
/*    */ {
/* 26 */   private static final vk a = new vk("texts/splashes.txt");
/* 27 */   private static final Random b = new Random();
/*    */   
/* 29 */   private final List<String> c = Lists.newArrayList();
/*    */   private final dkm d;
/*    */   
/*    */   public ekt(dkm ☃) {
/* 33 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected List<String> a(ach ☃, anw anw1) {
/* 38 */     try(acg ☃ = djz.C().N().a(a); 
/* 39 */         BufferedReader ☃ = new BufferedReader(new InputStreamReader(acg.b(), StandardCharsets.UTF_8))) {
/*    */ 
/*    */       
/* 42 */       return (List)bufferedReader.lines().map(String::trim).filter(☃ -> (☃.hashCode() != 125780783)).collect(Collectors.toList());
/* 43 */     } catch (IOException iOException) {
/* 44 */       return Collections.emptyList();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(List<String> ☃, ach ach1, anw anw1) {
/* 50 */     this.c.clear();
/* 51 */     this.c.addAll(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public String a() {
/* 56 */     Calendar ☃ = Calendar.getInstance();
/* 57 */     ☃.setTime(new Date());
/*    */     
/* 59 */     if (☃.get(2) + 1 == 12 && ☃.get(5) == 24)
/* 60 */       return "Merry X-mas!"; 
/* 61 */     if (☃.get(2) + 1 == 1 && ☃.get(5) == 1)
/* 62 */       return "Happy new year!"; 
/* 63 */     if (☃.get(2) + 1 == 10 && ☃.get(5) == 31) {
/* 64 */       return "OOoooOOOoooo! Spooky!";
/*    */     }
/*    */ 
/*    */     
/* 68 */     if (this.c.isEmpty())
/* 69 */       return null; 
/* 70 */     if (this.d != null && b.nextInt(this.c.size()) == 42) {
/* 71 */       return this.d.c().toUpperCase(Locale.ROOT) + " IS YOU";
/*    */     }
/* 73 */     return this.c.get(b.nextInt(this.c.size()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */