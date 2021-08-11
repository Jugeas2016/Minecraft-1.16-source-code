/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.ParseResults;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cy
/*     */ {
/*     */   private final c[] a;
/*     */   private final vk b;
/*     */   
/*     */   public cy(vk ☃, c[] arrayOfC) {
/*  21 */     this.b = ☃;
/*  22 */     this.a = arrayOfC;
/*     */   }
/*     */   
/*     */   public vk a() {
/*  26 */     return this.b;
/*     */   }
/*     */   
/*     */   public c[] b() {
/*  30 */     return this.a;
/*     */   }
/*     */   
/*     */   public static cy a(vk ☃, CommandDispatcher<db> commandDispatcher, db db1, List<String> list) {
/*  34 */     List<c> list1 = Lists.newArrayListWithCapacity(list.size());
/*  35 */     for (int i = 0; i < list.size(); i++) {
/*  36 */       int j = i + 1;
/*  37 */       String str = ((String)list.get(i)).trim();
/*  38 */       StringReader stringReader = new StringReader(str);
/*     */       
/*  40 */       if (stringReader.canRead() && stringReader.peek() != '#') {
/*     */ 
/*     */ 
/*     */         
/*  44 */         if (stringReader.peek() == '/') {
/*  45 */           stringReader.skip();
/*  46 */           if (stringReader.peek() == '/') {
/*  47 */             throw new IllegalArgumentException("Unknown or invalid command '" + str + "' on line " + j + " (if you intended to make a comment, use '#' not '//')");
/*     */           }
/*  49 */           String str1 = stringReader.readUnquotedString();
/*  50 */           throw new IllegalArgumentException("Unknown or invalid command '" + str + "' on line " + j + " (did you mean '" + str1 + "'? Do not use a preceding forwards slash.)");
/*     */         } 
/*     */ 
/*     */         
/*     */         try {
/*  55 */           ParseResults<db> parseResults = commandDispatcher.parse(stringReader, db1);
/*  56 */           if (parseResults.getReader().canRead()) {
/*  57 */             throw dc.a(parseResults);
/*     */           }
/*  59 */           list1.add(new b(parseResults));
/*     */         }
/*  61 */         catch (CommandSyntaxException commandSyntaxException) {
/*  62 */           throw new IllegalArgumentException("Whilst parsing command on line " + j + ": " + commandSyntaxException.getMessage());
/*     */         } 
/*     */       } 
/*     */     } 
/*  66 */     return new cy(☃, list1.<c>toArray(new c[0]));
/*     */   }
/*     */   
/*     */   public static interface c {
/*     */     void a(vx param1vx, db param1db, ArrayDeque<vx.a> param1ArrayDeque, int param1Int) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   public static class b implements c {
/*     */     private final ParseResults<db> a;
/*     */     
/*     */     public b(ParseResults<db> ☃) {
/*  77 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(vx ☃, db db1, ArrayDeque<vx.a> arrayDeque, int i) throws CommandSyntaxException {
/*  82 */       ☃.c().execute(new ParseResults(this.a.getContext().withSource(db1), this.a.getReader(), this.a.getExceptions()));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  87 */       return this.a.getReader().getString();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class d implements c {
/*     */     private final cy.a a;
/*     */     
/*     */     public d(cy ☃) {
/*  95 */       this.a = new cy.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(vx ☃, db db1, ArrayDeque<vx.a> arrayDeque, int i) {
/* 100 */       this.a.a(☃).ifPresent(cy1 -> {
/*     */             cy.c[] arrayOfC = cy1.b();
/*     */             int i = ☃ - arrayDeque.size();
/*     */             int j = Math.min(arrayOfC.length, i);
/*     */             for (int k = j - 1; k >= 0; k--) {
/*     */               arrayDeque.addFirst(new vx.a(vx1, db1, arrayOfC[k]));
/*     */             }
/*     */           });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 112 */       return "function " + this.a.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a {
/* 117 */     public static final a a = new a((vk)null);
/*     */     
/*     */     @Nullable
/*     */     private final vk b;
/*     */     private boolean c;
/* 122 */     private Optional<cy> d = Optional.empty();
/*     */     
/*     */     public a(@Nullable vk ☃) {
/* 125 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     public a(cy ☃) {
/* 129 */       this.c = true;
/* 130 */       this.b = null;
/* 131 */       this.d = Optional.of(☃);
/*     */     }
/*     */     
/*     */     public Optional<cy> a(vx ☃) {
/* 135 */       if (!this.c) {
/* 136 */         if (this.b != null) {
/* 137 */           this.d = ☃.a(this.b);
/*     */         }
/* 139 */         this.c = true;
/*     */       } 
/* 141 */       return this.d;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public vk a() {
/* 146 */       return this.d.<vk>map(☃ -> cy.a(☃)).orElse(this.b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */