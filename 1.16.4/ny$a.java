/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*     */ public class a
/*     */   extends ny
/*     */ {
/*     */   private final String g;
/*     */   @Nullable
/*     */   private final em h;
/*     */   
/*     */   public a(String ☃, boolean bool, String str1) {
/* 113 */     super(☃, bool);
/* 114 */     this.g = str1;
/* 115 */     this.h = d(this.g);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private em d(String ☃) {
/*     */     try {
/* 121 */       return ek.a().a(new StringReader(☃));
/* 122 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 123 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private a(String ☃, @Nullable dr.h h1, boolean bool, String str1, @Nullable em em1) {
/* 128 */     super(☃, h1, bool);
/* 129 */     this.g = str1;
/* 130 */     this.h = em1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String j() {
/* 135 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public a k() {
/* 140 */     return new a(this.e, this.f, this.d, this.g, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Stream<md> a(db ☃) {
/* 145 */     if (this.h != null) {
/* 146 */       aag aag = ☃.e();
/* 147 */       fx fx = this.h.c(☃);
/* 148 */       if (aag.p(fx)) {
/* 149 */         ccj ccj = aag.c(fx);
/*     */         
/* 151 */         if (ccj != null) {
/* 152 */           return Stream.of(ccj.a(new md()));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 157 */     return Stream.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 162 */     if (this == ☃) {
/* 163 */       return true;
/*     */     }
/*     */     
/* 166 */     if (☃ instanceof a) {
/* 167 */       a a1 = (a)☃;
/* 168 */       return (Objects.equals(this.g, a1.g) && 
/* 169 */         Objects.equals(this.e, a1.e) && super
/* 170 */         .equals(☃));
/*     */     } 
/*     */     
/* 173 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 178 */     return "BlockPosArgument{pos='" + this.g + '\'' + "path='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */       
/* 182 */       c() + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ny$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */