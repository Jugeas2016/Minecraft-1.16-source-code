/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class b
/*     */   extends ny
/*     */ {
/*     */   private final String g;
/*     */   @Nullable
/*     */   private final fc h;
/*     */   
/*     */   public b(String ☃, boolean bool, String str1) {
/*  39 */     super(☃, bool);
/*  40 */     this.g = str1;
/*  41 */     this.h = d(str1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static fc d(String ☃) {
/*     */     try {
/*  47 */       fd fd = new fd(new StringReader(☃));
/*  48 */       return fd.t();
/*  49 */     } catch (CommandSyntaxException commandSyntaxException) {
/*  50 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private b(String ☃, @Nullable dr.h h1, boolean bool, String str1, @Nullable fc fc1) {
/*  55 */     super(☃, h1, bool);
/*  56 */     this.g = str1;
/*  57 */     this.h = fc1;
/*     */   }
/*     */   
/*     */   public String j() {
/*  61 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public b k() {
/*  66 */     return new b(this.e, this.f, this.d, this.g, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Stream<md> a(db ☃) throws CommandSyntaxException {
/*  71 */     if (this.h != null) {
/*  72 */       List<? extends aqa> list = this.h.b(☃);
/*  73 */       return list.stream().map(cb::b);
/*     */     } 
/*     */     
/*  76 */     return Stream.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  81 */     if (this == ☃) {
/*  82 */       return true;
/*     */     }
/*     */     
/*  85 */     if (☃ instanceof b) {
/*  86 */       b b1 = (b)☃;
/*  87 */       return (Objects.equals(this.g, b1.g) && 
/*  88 */         Objects.equals(this.e, b1.e) && super
/*  89 */         .equals(☃));
/*     */     } 
/*     */     
/*  92 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  97 */     return "EntityNbtComponent{selector='" + this.g + '\'' + "path='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */       
/* 101 */       c() + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ny$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */