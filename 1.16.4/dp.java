/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
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
/*     */ public class dp
/*     */   implements ArgumentType<dp.a>
/*     */ {
/*  22 */   private static final Collection<String> a = Arrays.asList(new String[] { "Hello world!", "foo", "@e", "Hello @p :)" });
/*     */   
/*     */   public static dp a() {
/*  25 */     return new dp();
/*     */   }
/*     */   
/*     */   public static nr a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  29 */     return ((a)☃.getArgument(str, a.class)).a((db)☃.getSource(), ((db)☃.getSource()).c(2));
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(StringReader ☃) throws CommandSyntaxException {
/*  34 */     return a.a(☃, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  39 */     return a;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final String a;
/*     */     private final dp.b[] b;
/*     */     
/*     */     public a(String ☃, dp.b[] arrayOfB) {
/*  47 */       this.a = ☃;
/*  48 */       this.b = arrayOfB;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public nr a(db ☃, boolean bool) throws CommandSyntaxException {
/*  60 */       if (this.b.length == 0 || !bool) {
/*  61 */         return new oe(this.a);
/*     */       }
/*     */       
/*  64 */       nx nx = new oe(this.a.substring(0, this.b[0].a()));
/*  65 */       int i = this.b[0].a();
/*     */       
/*  67 */       for (dp.b b1 : this.b) {
/*  68 */         nr nr = b1.a(☃);
/*  69 */         if (i < b1.a()) {
/*  70 */           nx.c(this.a.substring(i, b1.a()));
/*     */         }
/*  72 */         if (nr != null) {
/*  73 */           nx.a(nr);
/*     */         }
/*  75 */         i = b1.b();
/*     */       } 
/*     */       
/*  78 */       if (i < this.a.length()) {
/*  79 */         nx.c(this.a.substring(i, this.a.length()));
/*     */       }
/*     */       
/*  82 */       return nx;
/*     */     }
/*     */     
/*     */     public static a a(StringReader ☃, boolean bool) throws CommandSyntaxException {
/*  86 */       String str = ☃.getString().substring(☃.getCursor(), ☃.getTotalLength());
/*     */       
/*  88 */       if (!bool) {
/*  89 */         ☃.setCursor(☃.getTotalLength());
/*  90 */         return new a(str, new dp.b[0]);
/*     */       } 
/*     */       
/*  93 */       List<dp.b> list = Lists.newArrayList();
/*  94 */       int i = ☃.getCursor();
/*     */       
/*  96 */       while (☃.canRead()) {
/*  97 */         if (☃.peek() == '@') {
/*  98 */           fc fc; int j = ☃.getCursor();
/*     */           
/*     */           try {
/* 101 */             fd fd = new fd(☃);
/* 102 */             fc = fd.t();
/* 103 */           } catch (CommandSyntaxException commandSyntaxException) {
/* 104 */             if (commandSyntaxException.getType() == fd.d || commandSyntaxException.getType() == fd.b) {
/* 105 */               ☃.setCursor(j + 1);
/*     */               continue;
/*     */             } 
/* 108 */             throw commandSyntaxException;
/*     */           } 
/* 110 */           list.add(new dp.b(j - i, ☃.getCursor() - i, fc)); continue;
/*     */         } 
/* 112 */         ☃.skip();
/*     */       } 
/*     */ 
/*     */       
/* 116 */       return new a(str, list.<dp.b>toArray(new dp.b[list.size()]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final int a;
/*     */     private final int b;
/*     */     private final fc c;
/*     */     
/*     */     public b(int ☃, int i, fc fc1) {
/* 126 */       this.a = ☃;
/* 127 */       this.b = i;
/* 128 */       this.c = fc1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 132 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 136 */       return this.b;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public nr a(db ☃) throws CommandSyntaxException {
/* 145 */       return fc.a(this.c.b(☃));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */