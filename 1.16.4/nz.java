/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class nz
/*     */   extends nn
/*     */   implements nt
/*     */ {
/*     */   private final String d;
/*     */   @Nullable
/*     */   private final fc e;
/*     */   private final String f;
/*     */   
/*     */   @Nullable
/*     */   private static fc d(String ☃) {
/*     */     try {
/*  29 */       return (new fd(new StringReader(☃))).t();
/*  30 */     } catch (CommandSyntaxException commandSyntaxException) {
/*     */       
/*  32 */       return null;
/*     */     } 
/*     */   }
/*     */   public nz(String ☃, String str1) {
/*  36 */     this(☃, d(☃), str1);
/*     */   }
/*     */   
/*     */   private nz(String ☃, @Nullable fc fc1, String str1) {
/*  40 */     this.d = ☃;
/*  41 */     this.e = fc1;
/*  42 */     this.f = str1;
/*     */   }
/*     */   
/*     */   public String h() {
/*  46 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String j() {
/*  55 */     return this.f;
/*     */   }
/*     */   
/*     */   private String a(db ☃) throws CommandSyntaxException {
/*  59 */     if (this.e != null) {
/*  60 */       List<? extends aqa> list = this.e.b(☃);
/*  61 */       if (!list.isEmpty()) {
/*  62 */         if (list.size() != 1) {
/*  63 */           throw dk.a.create();
/*     */         }
/*  65 */         return ((aqa)list.get(0)).bU();
/*     */       } 
/*     */     } 
/*  68 */     return this.d;
/*     */   }
/*     */   
/*     */   private String a(String ☃, db db1) {
/*  72 */     MinecraftServer minecraftServer = db1.j();
/*  73 */     if (minecraftServer != null) {
/*  74 */       ddn ddn = minecraftServer.aH();
/*  75 */       ddk ddk = ddn.d(this.f);
/*  76 */       if (ddn.b(☃, ddk)) {
/*  77 */         ddm ddm = ddn.c(☃, ddk);
/*  78 */         return Integer.toString(ddm.b());
/*     */       } 
/*     */     } 
/*  81 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public nz k() {
/*  86 */     return new nz(this.d, this.e, this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public nx a(@Nullable db ☃, @Nullable aqa aqa1, int i) throws CommandSyntaxException {
/*  91 */     if (☃ == null) {
/*  92 */       return new oe("");
/*     */     }
/*     */     
/*  95 */     String str1 = a(☃);
/*  96 */     String str2 = (aqa1 != null && str1.equals("*")) ? aqa1.bU() : str1;
/*  97 */     return new oe(a(str2, ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 102 */     if (this == ☃) {
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     if (☃ instanceof nz) {
/* 107 */       nz nz1 = (nz)☃;
/* 108 */       return (this.d.equals(nz1.d) && this.f.equals(nz1.f) && super.equals(☃));
/*     */     } 
/*     */     
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 116 */     return "ScoreComponent{name='" + this.d + '\'' + "objective='" + this.f + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */       
/* 120 */       c() + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */